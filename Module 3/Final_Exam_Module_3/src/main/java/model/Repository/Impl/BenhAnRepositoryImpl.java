package model.Repository.Impl;

import model.Repository.BaseRepository;
import model.Repository.BenhAnRepository;
import model.Service.BenhAn;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BenhAnRepositoryImpl implements BenhAnRepository {
    private static final String LIST_ALL_BENH_AN = "select * from benhan;";
    private static final String SEARCH_BENH_AN_BY_ID = "select * from benhan where ma_benh_an = ?;";
    private static final String DELETE_BENH_AN = "delete from benhan where ma_benh_an = ?;";
    private static final String EDIT_BENH_AN = "UPDATE from";

    @Override
    public List<BenhAn> listAll() {
        List<BenhAn> benhAnList = new ArrayList<>();

        try (Connection connection = BaseRepository.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(LIST_ALL_BENH_AN)) {

            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int ma_benh_an = resultSet.getInt("ma_benh_an");
                String ma_benh_nhan = resultSet.getString("ma_benh_nhan");
                String ten_benh_nhan = resultSet.getString("ten_benh_nhan");
                String ngay_nhap_vien = resultSet.getString("ngay_nhap_vien");
                String ngay_ra_vien = resultSet.getString("ngay_ra_vien");
                String ly_do_nhap_vien = resultSet.getString("ly_do_nhap_vien");

                BenhAn benhAn = new BenhAn(ma_benh_an, ma_benh_nhan, ten_benh_nhan, ngay_nhap_vien, ngay_ra_vien, ly_do_nhap_vien);
                benhAnList.add(benhAn);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return benhAnList;
    }


    @Override
    public boolean deleteBenhAn(int ma_benh_an) {
        Connection connection = BaseRepository.getConnection();
        boolean check = false;

        try{
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_BENH_AN);
            preparedStatement.setInt(1, ma_benh_an);
            check = preparedStatement.executeUpdate() > 0;
        }catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return check;
    }

    @Override
    public boolean editBenhAn(BenhAn benhan) {
        boolean rowUpdated = false;
        try(Connection connection = BaseRepository.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement()){


            rowUpdated = preparedStatement.executeUpdate() > 0;
        }catch (SQLException e){
            e.printStackTrace();
        }
        return rowUpdated;
    }

    @Override
    public BenhAn getBenhAnById(int ma_benh_an) {
        BenhAn benhAn = null;
        Connection connection = BaseRepository.getConnection();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SEARCH_BENH_AN_BY_ID);

            preparedStatement.setInt(1, ma_benh_an);

            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                ma_benh_an = resultSet.getInt("ma_benh_an");
                String ma_benh_nhan = resultSet.getString("ma_benh_nhan");
                String ten_benh_nhan = resultSet.getString("ten_benh_nhan");
                String ngay_nhap_vien = resultSet.getString("ngay_nhap_vien");
                String ngay_ra_vien = resultSet.getString("ngay_ra_vien");
                String ly_do_nhap_vien = resultSet.getString("ly_do_nhap_vien");

                benhAn = new BenhAn(ma_benh_an, ma_benh_nhan, ten_benh_nhan, ngay_nhap_vien, ngay_ra_vien, ly_do_nhap_vien);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return benhAn;
    }
}
