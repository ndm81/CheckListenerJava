import java.awt.*;
import java.awt.event.*;
    class CheckListener{
	CheckListener(){
		Frame f=new Frame();
		final Label label=new Label();
		label.setAlignment(Label.CENTER);
		label.setSize(400,400);
		Checkbox c1=new Checkbox("Hey");
		         c1.setBounds(80,100,100,30);

		Checkbox c2=new Checkbox("You");
		         c2.setBounds(80,100,150,30);
		f.add(c1);f.add(c2);f.add(label);
		c1.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent e){
				label.setText("C=="+(e.getStateChange()==1?"checked":"unchecked"));
			}
		});

		c2.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent e){
				label.setText("hey"+(e.getStateChange()==1? "checked":"unchecked"));
			}
		});
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		new CheckListener();
	}
}