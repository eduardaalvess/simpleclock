package ClockApp;

import javax.swing.JLabel;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MyFrame extends JFrame {

    Calendar calendar;
    SimpleDateFormat timeFormat;
    SimpleDateFormat dayFormat;
    SimpleDateFormat dateFormat;
    JLabel timeLabel;
    JLabel dayLabel;
    JLabel dateLabel;
    String day;
    String time;
    String date;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Clock");
        this.setLayout(new FlowLayout());

        this.setSize(350,200);
        this.setResizable(false);

        timeFormat = new SimpleDateFormat("hh:mm:ss a");
        dayFormat = new SimpleDateFormat("E");
        dateFormat = new SimpleDateFormat("MMMMM dd, yyyy");

        /*

        --------------- TIME -----------------

         */

        timeLabel = new JLabel();

        timeLabel.setFont(new Font("Consolas", Font.PLAIN, 50));

        timeLabel.setForeground(new Color(737373));

        timeLabel.setBackground(Color.lightGray);

        timeLabel.setOpaque(true);

        /*

        --------------- DAY -----------------

         */

        dayLabel = new JLabel();
        dayLabel.setFont(new Font("Consolas",Font.PLAIN,25));

        /*

        ------------------ DATE -----------------

         */

        dateLabel = new JLabel();
        dateLabel.setFont(new Font("Consolas",Font.PLAIN,25));

        this.add(timeLabel);
        this.add(dayLabel);
        this.add(dateLabel);
        this.setVisible(true);

        setTime();
    }

    public void setTime() {

        while(true) {

            time = timeFormat.format(Calendar.getInstance().getTime());
            timeLabel.setText(time);

            day = dayFormat.format(Calendar.getInstance().getTime());
            dayLabel.setText(day);

            date = dateFormat.format(Calendar.getInstance().getTime());
            dateLabel.setText(date);

            try {

                Thread.sleep(1000);

            } catch (InterruptedException ex)
            {
                ex.printStackTrace();
            }

        }

    }
}
