package Sekolah;
import java.util.Arrays;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class siswa {
    String nama;

    public siswa(String nama){
        this.nama = nama;
    }
    public void display(){
        System.out.println("Nama siswa adalah " + this.nama);
    }
}
