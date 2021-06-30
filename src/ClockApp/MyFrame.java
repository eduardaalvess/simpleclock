package ClockApp;

import javax.swing.JLabel;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MyFrame extends JFrame {

    String time;

    Calendar calendar;
    SimpleDateFormat timeFormat;
    JLabel timeLabel;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Clock");
        this.setLayout(new FlowLayout());

        this.setSize(350,200);
        this.setResizable(false);

        timeFormat = new SimpleDateFormat("hh:mm:ss a");

        timeLabel = new JLabel();

        timeLabel.setFont(new Font("Consolas", Font.PLAIN, 50));

        timeLabel.setForeground(new Color(737373));

        timeLabel.setBackground(Color.lightGray);

        timeLabel.setOpaque(true);

        this.add(timeLabel);

        this.setVisible(true);

        setTime();
    }

    public void setTime() {

        while(true) {

            time = timeFormat.format(Calendar.getInstance().getTime());
            timeLabel.setText(time);

            try {

                Thread.sleep(1000);

            } catch (InterruptedException ex)
            {
                ex.printStackTrace();
            }

        }

    }
}
