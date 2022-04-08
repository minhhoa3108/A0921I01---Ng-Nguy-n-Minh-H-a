package common;

public class Validation {
    public static boolean checkName(String ho_ten){
        String regex = "^[a-zA-ZÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚĂĐĨŨƠàáâãèéêìíòóôõùúăđĩũơƯĂẠẢẤẦẨẪẬẮẰẲẴẶẸẺẼỀỀỂẾưăạảấầẩẫậắằẳẵặẹẻẽềềểếỄỆỈỊỌỎỐỒỔỖỘỚỜỞỠỢỤỦỨỪễệỉịọỏốồổỗộớờởỡợụủứừỬỮỰỲỴÝỶỸửữựỳỵỷỹ\\s\\W|_]+$";
        return ho_ten.matches(regex);
    }

    public static boolean checkEmail(String email){
        String regex = "^[a-zA-Z0-9]{4,}@gmail\\.com$";
        return email.matches(regex);
    }

    public static boolean checkPhone(String so_dien_thoai){
        String regex = "[0-9]{10}";
        return so_dien_thoai.matches(regex);
    }
}
