package agent;

import java.util.Arrays;

public class Block1 {
	//private String Farmers_name;
	private FrameWork[] frames;
	private int prev_hash;
	private int blockHash;
	
	public Block1(int prev_hash,FrameWork[] frames) {
		this.frames=frames;
		this.prev_hash=prev_hash;
		Object[] contens = {Arrays.hashCode(frames), prev_hash};
	    this.blockHash = Arrays.hashCode(contens);
	}
	public FrameWork[] Get_frame() {
		return this.frames;
	}
	
	public int Get_prevhash() {
        
		return  this.prev_hash;
	}
	public int Get_Block_hash() {
		return this.blockHash;
	}
	
	public void showData()
	{
		int k=2;
  	   for(int i=0;i<k;i++) {
  		   frames[i].Show_Details();
  	   }
	}
}
