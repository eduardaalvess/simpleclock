package ClockApp;

import javax.swing.*;
import java.awt.*;
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

        time = timeFormat.format(Calendar.getInstance().getTime());
        timeLabel.setText(time);
        this.add(timeLabel);

        this.setVisible(true);
    }
}
