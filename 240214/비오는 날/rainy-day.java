import java.util.Comparator;
import java.util.Scanner;
import java.util.Arrays;

class Weather {
    public String date;
    public String day;
    public String data;

    public Weather(String date, String day, String data) {
        this.date = date;
        this.day = day;
        this.data = data;
    }
}

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Weather[] weathers = new Weather[n];

        for (int i = 0; i < n; i++) {
            weathers[i] = new Weather(sc.next(), sc.next(), sc.next());
        }

        Arrays.sort(weathers, new Comparator<Weather>() {
            @Override
            public int compare(Weather o1, Weather o2) {
                return o1.date.compareTo(o2.date);
            }
        });

        for (int i = 0; i < n; i++) {
            if (weathers[i].data.equals("Rain")) {
                System.out.println(weathers[i].date + " " + weathers[i].day + " " + weathers[i].data);
                break;
            }
        }
    }
}