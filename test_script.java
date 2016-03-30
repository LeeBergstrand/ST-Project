
import resources.Script1Helper;
import com.rational.test.ft.*;
import com.rational.test.ft.object.interfaces.*;
import com.rational.test.ft.object.interfaces.SAP.*;
import com.rational.test.ft.object.interfaces.WPF.*;
import com.rational.test.ft.object.interfaces.dojo.*;
import com.rational.test.ft.object.interfaces.siebel.*;
import com.rational.test.ft.object.interfaces.flex.*;
import com.rational.test.ft.object.interfaces.generichtmlsubdomain.*;
import com.rational.test.ft.script.*;
import com.rational.test.ft.value.*;
import com.rational.test.ft.vp.*;
import com.ibm.rational.test.ft.object.interfaces.sapwebportal.*;
/**
 * Description   : Functional Test Script
 * @author T00011523
 */
public class Script1 extends Script1Helper
{
	/**
	 * Script Name   : <b>Script1</b>
	 * Generated     : <b>Mar 29, 2016 10:12:24 PM</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2016/03/29
	 * @author T00011523
	 */
	public void testMain(Object[] args) 
	{
		startApp("The program");
		
		// Window: The program.exe: The Saturn Windshield Wiper Controller
		offradioButton().click();
		_0label().performTest(_0_textVP());
		
		intradioButton().click();
		comboBox1comboBox().click();
		comboBox1comboBox().click(atText("1"));
		_4label().performTest(_4_textVP());
		
		comboBox1comboBox().click();
		comboBox1comboBox().click(atText("2"));
		_6label().performTest(_6_textVP());
		
		comboBox1comboBox().click();
		comboBox1comboBox().click(atText("3"));
		_12label().performTest(_12_textVP());
		
		lowradioButton().click();
		_30label().performTest(_30_textVP());
		
		highradioButton().click();
		_60label().performTest(_60_textVP());
		
		theSaturnWindshieldWiperContro(ANY,MAY_EXIT).click(CLOSE_BUTTON);
	}
}