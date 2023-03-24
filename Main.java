import java.awt.*;
import java.awt.event.*;

public class Main {
    int score;
    String Name;
    String fnumber;
    Main() {

        Frame f1;
        f1 = new Frame();
        f1.setVisible(true);
        f1.setSize(400, 400);
        f1.setLayout(null);
        f1.setBackground(Color.GRAY);
        f1.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                f1.dispose();
            }
        });

        Label titel = new Label("Disha Computer Exam Login");
        titel.setBounds(100, 80, 500, 30);
        titel.setForeground(Color.WHITE);

        Label name = new Label("Name:");
        name.setBounds(100, 150, 50, 20);
        Label fnum = new Label("Form Number:");
        fnum.setBounds(100, 210, 100, 20);

        TextField name1 = new TextField();
        name1.setBounds(200, 150, 80, 20);

        TextField fnum1 = new TextField();
        fnum1.setBounds(200, 210, 50, 20);


        Button submit = new Button("Login");
        submit.setBounds(150, 300, 50, 30);
        f1.add(submit);
        f1.add(name1);
        f1.add(fnum1);
        f1.add(name);
        f1.add(fnum);
        f1.add(titel);
        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Name= name1.getText();
                fnumber= fnum1.getText();
                f1.dispose();
                run();

            }
        });
    }

    public void run() {
        Frame f2 = new Frame();
        f2.setVisible(true);
        f2.setSize(400, 400);
        f2.setLayout(null);
        f2.setBackground(Color.GRAY);
        f2.setForeground(Color.WHITE);
        Label q1 = new Label("Q1. What is a correct syntax to output \"Hello World\"  in C?");
        q1.setBounds(30, 100, 350, 30);
        q1.setForeground(Color.green);
        CheckboxGroup cbg = new CheckboxGroup();
        Checkbox ch1 = new Checkbox(" printf(\"Hello World\");", false, cbg);
        ch1.setBounds(30, 150, 300, 30);
        Checkbox ch2 = new Checkbox("System.out.printline(\"Hello World\");", false, cbg);
        ch2.setBounds(30, 200, 300, 30);
        Checkbox ch3 = new Checkbox(" cout << \"Hello World\";", false, cbg);
        ch3.setBounds(30, 250, 300, 30);
        Checkbox ch4 = new Checkbox(" Console.WriteLine(\"Hello World\");", false, cbg);
        ch4.setBounds(30, 300, 300, 30);
        Button Next = new Button("Save/Continue");
        Next.setBounds(250, 350, 100, 30);
        f2.add(ch1);
        f2.add(ch2);
        f2.add(ch3);
        f2.add(ch4);
        f2.add(Next);
        f2.add(q1);
        ch1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                score+=20;
            }
        });
        Next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f2.dispose();
                run1();

            }
        });
    }

    public void run1() {
        Frame f3 = new Frame();
        f3.setVisible(true);
        f3.setSize(400, 400);
        f3.setLayout(null);
        f3.setBackground(Color.GRAY);
        f3.setForeground(Color.WHITE);
        Label q1 = new Label("Q2. How do you insert COMMENTS in C code?");
        q1.setBounds(30, 100, 350, 30);
        q1.setForeground(Color.green);
        CheckboxGroup cbg = new CheckboxGroup();
        Checkbox ch1 = new Checkbox(" # This is a comment", false, cbg);
        ch1.setBounds(30, 150, 300, 30);
        Checkbox ch2 = new Checkbox("// This is a comment", false, cbg);
        ch2.setBounds(30, 200, 300, 30);
        Checkbox ch3 = new Checkbox(" * This is a comment", false, cbg);
        ch3.setBounds(30, 250, 300, 30);
        Checkbox ch4 = new Checkbox("  -- This is a comment", false, cbg);
        ch4.setBounds(30, 300, 300, 30);
        Button Next = new Button("Save/Continue");
        Next.setBounds(250, 350, 100, 30);
        f3.add(ch1);
        f3.add(ch2);
        f3.add(ch3);
        f3.add(ch4);
        f3.add(Next);
        f3.add(q1);
        ch2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                score+=20;
            }
        });
        Next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f3.dispose();
                run2();


            }
        });
    }
    public void run2() {
        Frame f4 = new Frame();
        f4.setVisible(true);
        f4.setSize(400, 400);
        f4.setLayout(null);
        f4.setBackground(Color.GRAY);
        f4.setForeground(Color.WHITE);
        Label q1 = new Label("Q3.How can you create a variable with the numeric value 5?");
        q1.setBounds(30, 100, 350, 30);
        q1.setForeground(Color.green);
        CheckboxGroup cbg = new CheckboxGroup();
        Checkbox ch1 = new Checkbox(" val num = 5;", false, cbg);
        ch1.setBounds(30, 150, 300, 30);
        Checkbox ch2 = new Checkbox(" int num = 5;", false, cbg);
        ch2.setBounds(30, 200, 300, 30);
        Checkbox ch3 = new Checkbox("  num = 5;", false, cbg);
        ch3.setBounds(30, 250, 300, 30);
        Checkbox ch4 = new Checkbox("  num = 5 int;", false, cbg);
        ch4.setBounds(30, 300, 300, 30);
        Button Next = new Button("Save/Continue");
        Next.setBounds(250, 350, 100, 30);
        f4.add(ch1);
        f4.add(ch2);
        f4.add(ch3);
        f4.add(ch4);
        f4.add(Next);
        f4.add(q1);
        ch2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                score+=20;
            }
        });
        Next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f4.dispose();
                run3();

            }
        });
    }
    public void run3() {
        Frame f4 = new Frame();
        f4.setVisible(true);
        f4.setSize(400, 400);
        f4.setLayout(null);
        f4.setBackground(Color.GRAY);
        f4.setForeground(Color.WHITE);
        Label q1 = new Label("Q4. How can you create a variable with the floating number 2.8?");
        q1.setBounds(30, 100, 350, 30);
        q1.setForeground(Color.green);
        CheckboxGroup cbg = new CheckboxGroup();
        Checkbox ch1 = new Checkbox(" num = 2.8 double;", false, cbg);
        ch1.setBounds(30, 150, 300, 30);
        Checkbox ch2 = new Checkbox(" val num = 2.8;", false, cbg);
        ch2.setBounds(30, 200, 300, 30);
        Checkbox ch3 = new Checkbox(" num = 2.8 float;", false, cbg);
        ch3.setBounds(30, 250, 300, 30);
        Checkbox ch4 = new Checkbox(" float num = 2.8;", false, cbg);
        ch4.setBounds(30, 300, 300, 30);
        Button Next = new Button("Save/Continue");
        Next.setBounds(250, 350, 100, 30);
        f4.add(ch1);
        f4.add(ch2);
        f4.add(ch3);
        f4.add(ch4);
        f4.add(Next);
        f4.add(q1);
        ch4.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                score+=20;
            }
        });
        Next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f4.dispose();
                run4();
            }
        });
    }
    public void run4() {
        Frame f5 = new Frame();
        f5.setVisible(true);
        f5.setSize(400, 400);
        f5.setLayout(null);
        f5.setBackground(Color.GRAY);
        f5.setForeground(Color.WHITE);
        Label q1 = new Label("Q5.Which function is often used to output values and print text?");
        q1.setBounds(30, 100, 350, 30);
        q1.setForeground(Color.green);
        CheckboxGroup cbg = new CheckboxGroup();
        Checkbox ch1 = new Checkbox(" printword()", false, cbg);
        ch1.setBounds(30, 150, 300, 30);
        Checkbox ch2 = new Checkbox(" output()", false, cbg);
        ch2.setBounds(30, 200, 300, 30);
        Checkbox ch3 = new Checkbox("  write()", false, cbg);
        ch3.setBounds(30, 250, 300, 30);
        Checkbox ch4 = new Checkbox("  printf()", false, cbg);
        ch4.setBounds(30, 300, 300, 30);
        Button Next = new Button("Save/Continue");
        Next.setBounds(250, 350, 100, 30);
        f5.add(ch1);
        f5.add(ch2);
        f5.add(ch3);
        f5.add(ch4);
        f5.add(Next);
        f5.add(q1);
        ch4.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                score+=20;
            }
        });
        Next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f5.dispose();
                run5();
            }
        });
    }
    public void run5() {
        Frame f6 = new Frame();
        f6.setVisible(true);
        f6.setSize(400, 400);
        f6.setLayout(null);
        f6.setBackground(Color.GRAY);
        f6.setForeground(Color.WHITE);
        Label na = new Label();
        na.setText("Name : "+Name);

        na.setBounds(150,50,150,30);
        Label fn = new Label();
        fn.setText("Number : "+fnumber);
        fn.setBounds(150,100,150,30);
        Label f = new Label("Final Result");
        f.setBounds(150,150,100,50);
        Label result = new Label();
        result.setText("Total "+score+"%");
        result.setBounds(150,200,80,50);
        Label conclusion =new Label();
        conclusion.setBackground(Color.white);
        conclusion.setBounds(100, 250, 200, 50);

        if(score>=60){
            conclusion.setForeground(Color.GREEN);
            conclusion.setText("Congratulations, You passed !!");
        }
        else{
            conclusion.setForeground(Color.red);
            conclusion.setText("Oops, You failed");
        }

        f6.add(f);
        f6.add(result);
        f6.add(na);
        f6.add(fn);
        f6.add(conclusion);

        f6.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                f6.dispose();
            }
        });



    }


    public static void main(String[] args) {
        Main m=new Main();

    }
}