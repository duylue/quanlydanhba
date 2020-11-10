import com.sun.source.tree.IfTree;

import java.io.*;
import java.util.ArrayList;

public class ManagePhoneBooks implements Serializable {
    ArrayList<InforPhonebook>  list= (ArrayList<InforPhonebook>) readFile();

    public void add(InforPhonebook n){
        if (list==null){
            list= new ArrayList<>();
        }
        list.add(n);
        writeFile();

    }
    public void read(){
        if (list==null){
            list= new ArrayList<>();
        }
        for (InforPhonebook i: list) {
            System.out.println(i.toString());

        }
    }

    public void update (InforPhonebook n){
        int count=0;
        for (InforPhonebook x:list) {
            if (x.getNumber().equals(n.getNumber())){
                x.setEmail(n.getEmail());
                x.setNumber(n.getNumber());
                x.setAddress(n.getAddress());
                x.setGioiTinh(n.getGioiTinh());
                x.setBirth(n.getBirth());
                x.setFullName(n.getFullName());
                x.setTeam(n.getTeam());
                count++;
            }
        }
        if (count==0){
            System.out.println("không tìm thấy số điện thoại");
        }
    }
    public void delete (String phoneNumber){
        int count=0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getNumber().equals(phoneNumber)){
                count++;
                list.remove(i);
            }
        }
        if (count==0){
            System.out.println("không tìm thấy số điện thoại");
        }
    }
    public InforPhonebook search(String numberPhone){

        InforPhonebook ib=null;
        for (InforPhonebook x:list) {
            if (x.getNumber().equals(numberPhone)){
                ib=x;
            }
        }

        return ib;
    }
    static final String fileStaff = "contacts.csv";

    public void writeFile() {
        try {
            FileOutputStream fos = new FileOutputStream(fileStaff);
            ObjectOutputStream oss = new ObjectOutputStream(fos);
            oss.writeObject(list);
            oss.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public Object readFile() {
        Object obj ;
        try {
            FileInputStream fis = new FileInputStream(fileStaff);
            ObjectInputStream ois = new ObjectInputStream(fis);
            obj = ois.readObject();
            ois.close();
            return obj;
        } catch (Exception e) {
            return null;
        }
    }

}
