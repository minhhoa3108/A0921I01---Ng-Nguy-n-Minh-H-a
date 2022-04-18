package model.Service.Impl;

import model.Repository.BenhAnRepository;
import model.Repository.Impl.BenhAnRepositoryImpl;
import model.Service.BenhAn;
import model.Service.BenhAnService;

import java.util.List;

public class BenhAnServiceImpl implements BenhAnService {
    BenhAnRepository benhAnRepository = new BenhAnRepositoryImpl();

    @Override
    public List<BenhAn> listAll() {
        return benhAnRepository.listAll();
    }

    @Override
    public boolean deleteBenhAn(int ma_benh_an) {
        return benhAnRepository.deleteBenhAn(ma_benh_an);
    }

    @Override
    public boolean editBenhAn(BenhAn benhan) {
        return benhAnRepository.editBenhAn(benhan);
    }

    @Override
    public BenhAn getBenhAnById(int ma_benh_an) {
        return benhAnRepository.getBenhAnById(ma_benh_an);
    }
}
