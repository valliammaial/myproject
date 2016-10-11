package mini1;
class a
{
	public int aaa=0;
	int aip=100;
 public void snacks(int ashare)
{
	aaa=aaa+ashare;
}
 public void bus(int dshare)
 {
     aaa+=dshare;
	 int aa=aip-aaa;
	 if(aa<0)
	 {
	 	System.out.println("A has to give"+Math.abs(aa));
	 }
	 else
	 {
	 	System.out.println("A gets"+Math.abs(aa));
	 }
}
}
class b extends a
{
	public int bbb=0;
	int bip=500;
	public void snacks(int ashare)
	{
		super.snacks(ashare);
    	bbb=bbb+ashare;
    }
	public void bus(int dshare)
	{
		super.bus(dshare);
		bbb+=dshare;
		int bb=bip-bbb;
		if(bb<0)
		{
			System.out.println("B has to give"+Math.abs(bb));
		}
		else
		{
			System.out.println("B gets"+Math.abs(bb));
		}
	}
}
class c extends b
{
	public int ccc=0;
	int cip=0;
	public void snacks(int ashare)
	{
		super.snacks(ashare);
    	ccc+=ashare;
    }
	public void taxi(int bshare)
	{
		ccc+=bshare;
	}
	public void bus(int dshare)
	{
		super.bus(dshare);
		int cc=cip-ccc;
		if(cc<0)
		{
			System.out.println("C has to give"+Math.abs(cc));
		}
		else
		{
			System.out.println("C gets"+Math.abs(cc));
		}
	}
}
class d extends c
{
	public int ddd=0;
	int dip=300;
    public void snacks(int ashare)
    {
    	super.snacks(ashare);
    	ddd+=ashare;
    }
    public void taxi(int bshare)
    { 
    	super.taxi(bshare);
    	ddd+=bshare;
    }
    public void bus(int dshare)
    {
    	super.bus(dshare);
    	int dd=dip-ddd;
        if(dd<0)
    	{
    		System.out.println("D has to give"+Math.abs(dd));
    	}
    	else
    	{
    		System.out.println("D gets"+Math.abs(dd));
    	}

    }
}
public class main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int ashare=100/4;
int bshare=500/2;
int dshare=300/2;
d D=new d();
D.snacks(ashare);
D.taxi(bshare);
D.bus(dshare);
    }
}
