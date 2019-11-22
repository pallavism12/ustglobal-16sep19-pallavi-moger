package com.ustglobal.objectclass;

public class UsbConnect {
	public static void connect(Object obj) {
		if(obj instanceof Mouse) {
			Mouse m=(Mouse)obj;
			m.click();
			m.scroll();
		}
		else if(obj instanceof Pendrives) {
			Pendrives p=(Pendrives)obj;
			p.read();
			p.write();
			
			
		}
	}

}
