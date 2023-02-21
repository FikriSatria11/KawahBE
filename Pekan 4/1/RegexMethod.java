import java.util.Scanner;
import java.util.regex.*;

public class RegexMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan Kata = ");
        String kata = scan.nextLine();
        System.out.println(kata);
        checkPattern(kata);
        
    }

    static void checkPattern(String kata){
        Pattern patternEmail = Pattern.compile("[a-zA-Z0-9_]+@[a-zA-Z]+\\.[a-zA-Z]");
        Matcher matcherEmail = patternEmail.matcher(kata);

        Pattern patternIp = Pattern.compile("[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}");
        Matcher matcherIp = patternIp.matcher(kata);

        Pattern patternDate1 = Pattern.compile("(senin|selasa|rabu|kamis|jumat|sabtu|minggu),\s(januari|februari|maret|april|mei|juni|juli|agustus|oktober|november|desember)\s([0-9]{2})$", Pattern.CASE_INSENSITIVE);
        Matcher matcherDate1 = patternDate1.matcher(kata);

        Pattern patternDate2 = Pattern.compile("(0[1-9]|[12][0-9]|3[01])-(0[1-9]|1[0-2])-\\d{4}$");
        Matcher matcherDate2 = patternDate2.matcher(kata);
    
        if(matcherEmail.find()) {
            System.out.println("String bertipe email");
        }else if(matcherIp.find()){
            System.out.println("String bertipe IP");
        }else if(matcherDate1.find()){
            System.out.println("String bertipe Tanggal (dddd, MMMM yy)");
        }else if(matcherDate2.find()){
            System.out.println("String bertipe Tanggal (dd-MM-yyyy)");
        }else{
            System.out.println("String bukan bagian dari pola");
        }
    }
}
