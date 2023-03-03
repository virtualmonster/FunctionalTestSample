
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
 * @author STUART.WALKER
 */
public class Script1 extends Script1Helper
{
	/**
	 * Script Name   : <b>Script1</b>
	 * Generated     : <b>3 Mar 2023 10:40:27</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 10.0  Build 19045 ()
	 * 
	 * @since  2023/03/03
	 * @author STUART.WALKER
	 */
	public void testMain(Object[] args) 
	{
		startApp("ClassicsJavaA");
		
		// Frame: ClassicsCD
		tree2().click(atPath("Composers->Haydn->Location(PLUS_MINUS)"));
		tree2().click(atPath("Composers->Haydn->Violin Concertos"));
		album().click(atText("Details"));
		placeOrder().click();
		
		// Frame: Member Logon
		password().click(atPoint(15,12));
		memberLogon().inputChars("bob");
		ok().click();
		
		// Frame: Place an Order
		cardNumberIncludeTheSpaces().click(atPoint(53,14));
		placeAnOrder().inputKeys("{Num4}");
		cancel().click();
		
		// Frame: ClassicsCD
		classicsCD(ANY,MAY_EXIT).close();
	}
}

