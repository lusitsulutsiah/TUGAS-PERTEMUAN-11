/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO G40
 */
public class StudentRecordExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 //membuat 3 object StudentRecord
 StudentRecord annaRecord = new StudentRecord();
 StudentRecord beahRecord = new StudentRecord();
 StudentRecord crisRecord = new StudentRecord();
 
 //memberi nama siswa
 annaRecord.setName("Anna");
 beahRecord.setName("Beah");
 crisRecord.setName("Cris");
 //menampilkan jumlah siswa
 System.out.println("Count="+StudentRecord.getStudentCount()
         );
    }
}
 
 
 