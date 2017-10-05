import javax.swing.JOptionPane;
public class metnum2{
	public static void main(String[] args){
		int x[],y[],x2[],y2[],xy[];
		int n;
		String jumlah;
		String nilaix,nilaiy;
		jumlah= JOptionPane.showInputDialog(null,"Masukan Jumlah Data");
		n= Integer.parseInt(jumlah);
		//Pembuatan Array Baru
		x=new int[n];y=new int[n];
		x2=new int[n];y2=new int[n];
		xy=new int[n];
		//Looping Masukan Nilai
		for(int i=0;i<n;i++){
			nilaix=JOptionPane.showInputDialog(null,"Masukan Nilai x-"+i);
			x[i]=Integer.parseInt(nilaix);
			nilaiy=JOptionPane.showInputDialog(null,"Masukan Nilai y-"+1);
			y[i]=Integer.parseInt(nilaiy);
			x2[i]=x[i]*x[i];
			y2[i]=y[i]*y[i];
			xy[i]=x[i]*y[i];
		}
		int jmx=sigx(x,n);
		int jmy=sigy(y,n);
		int jmx2=sigx2(x2,n);
		int jmy2=sigy2(y2,n);
		int jmxy=sigxy(x,y,n);
		double m=((n*jmxy)-(jmx*jmy))/((n*jmx2)-(jmx*jmx));
		double c=((jmy*jmx2)-(jmx*jmxy))/((n*jmx2)-(jmx*jmx));
		JOptionPane.showMessageDialog(null,"nilai sigma x="+jmx);
		JOptionPane.showMessageDialog(null,"nilai sigma y="+jmy);
		JOptionPane.showMessageDialog(null,"nilai sigma x2="+jmx2);
		JOptionPane.showMessageDialog(null,"nilai sigma y2="+jmy2);
		JOptionPane.showMessageDialog(null,"nilai sigma xy="+jmxy);
		JOptionPane.showMessageDialog(null,"nilai m="+m);
		JOptionPane.showMessageDialog(null,"nilai c="+c);
	}
	//Method Operasi
	public static int sigx(int x[],int z){
		int jumlahx=0;
		for(int i=0;i<z;i++){
			jumlahx=jumlahx+x[i];
		}
		return jumlahx;
	}
	
	public static int sigy(int y[],int n){
		int jumlahy=0;
		for(int i=0;i<n;i++){
			jumlahy=jumlahy+y[i];
		}
		return jumlahy;
	}
	
	public static int sigx2(int x2[],int n){
		int jumlahx2=0;
		for(int i=0;i<n;i++){
			jumlahx2=jumlahx2+x2[i];
		}
		return jumlahx2;
	}
	
	public static int sigy2(int y2[],int n){
		int jumlahy2=0;
		for(int i=0;i<n;i++){
			jumlahy2=jumlahy2+y2[i];
		}
		return jumlahy2;
	}
	
	public static int sigxy(int y[],int x[],int n){
		int jumlahxy=0;
		for(int i=0;i<n;i++){
			jumlahxy=jumlahxy+(x[i]*y[i]);
		}
		return jumlahxy;
	}

}


