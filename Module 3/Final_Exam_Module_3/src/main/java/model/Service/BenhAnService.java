package model.Service;

import java.util.List;

public interface BenhAnService {
    public List<BenhAn> listAll();

    public boolean deleteBenhAn(int ma_benh_an);

    public boolean editBenhAn(BenhAn benhan);

    BenhAn getBenhAnById(int ma_benh_an);
}
