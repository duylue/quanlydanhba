import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Menus {
    public InforPhonebook creat(){
        Scanner sc = new Scanner(System.in);
        InforPhonebook ib = new InforPhonebook();
        System.out.println("nhập số điện thoai");
        ib.setNumber(inputNumberPhone());
        System.out.println("Nhập tên");
        ib.setFullName(sc.nextLine());
        System.out.println("Ngày sinh");
        ib.setBirth(sc.nextLine());
        System.out.println("Địa  chỉ");
        ib.setAddress(sc.nextLine());
        System.out.println("giới tính");
        ib.setGioiTinh(sc.nextLine());
        System.out.println("Nhóm");
        ib.setTeam(sc.nextLine());
        System.out.println("nhap  email");
        ib.setEmail(inputMail());
        return ib;
    }
    public void menusClient(){
        System.out.println("1 Hiển thị danh sách");
        System.out.println("2 Thêm mới");
        System.out.println("3 Cập nhật");
        System.out.println("4 Xóa");
        System.out.println("5 tìm kiếm");
        System.out.println("6 đọc file");
        System.out.println("7 ghi file");
        System.out.println("0 exit");

    }
    public void program(){
        ManagePhoneBooks mpb =new ManagePhoneBooks();

        do {
            menusClient();
            Scanner sc = new Scanner(System.in);
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    mpb.read();
                    break;
                case 2:
                    InforPhonebook ib= creat();
                    mpb.add(ib);
                    break;
                case 3:
                    InforPhonebook ib2= creat();
                    mpb.update(ib2);
                    break;
                case 4:
                    System.out.println("Số cần xóa");
                    String numberPhoneDel = sc.nextLine();
                    mpb.delete(numberPhoneDel);
                    break;
                case 5:
                    String numberPhoneS = sc.nextLine();
                    InforPhonebook inforPhonebook = mpb.search(numberPhoneS);
                    System.out.println(inforPhonebook.toString());
                case 6:
                    mpb.writeFile();
                    break;
                case 7:
                   mpb.list= (ArrayList<InforPhonebook>) mpb.readFile();
            }
        }while (true);
    }
    public String inputNumberPhone(){
        String input="";
        Scanner scanner = new Scanner(System.in);
        String test = scanner.nextLine();
        String rg="^[0-9]{10}$";
        Pattern pattern= Pattern.compile(rg);
        Matcher matcher = pattern.matcher(test);
        if (matcher.find()){
            input=test;
        }else {
            System.out.println("sai dinh dang nhap lai");
            input=inputNumberPhone();
        }
        return input;
    }
    public String inputMail(){
        String inputMail ="";
        Scanner scanner = new Scanner(System.in);
        String test = scanner.nextLine();
        String rg="^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\\\.[A-Za-z0-9]+)$";
        Pattern pattern= Pattern.compile(rg);
        Matcher matcher = pattern.matcher(test);
        if (matcher.find()){
            inputMail=test;
        }else {
            System.out.println("sai dinh dang nhap lai");
            inputMail=inputMail();
        }
        return inputMail;
    }


}
