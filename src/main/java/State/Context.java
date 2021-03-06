package State;

import FactoryParameter.Parameter;

import java.io.Serializable;

/**
 * The Context Class: Context.
 */

public class Context implements Serializable {
	
	private State state;

	/**
     * New an initial state(i.e. PowderState).
     *
     */
	public Context(){
		System.out.println("======== 使用  State 模式 ========");
		state = new PowderState(this);
	}
	
	/**
     * Set state.
     *
     */
	public void setState(int stateId) {
		switch(stateId){
		case Parameter.powderState :
	        this.state = new PowderState(this);
	        break; 
		case Parameter.liquidState:
	    	this.state = new LiquidState(this);
	    	break; 
	    case Parameter.producedState:
	    	this.state = new ProducedState(this);
		    break; 
	    case Parameter.decoratedState:
	    	this.state = new DecoratedState(this);
		    break; 
	    case Parameter.soldState:
	    	this.state = new SoldState(this);
		    break;
		case Parameter.waitSoldState:
			this.state=new waitSoldState(this);
			break;
	    default : 
	    	System.out.println("错误,未知的状态值! 检查setState()中的输入");
	}
	}
	
	/**
     * Get current state value.
     */
	public int getState() {
		return state.stateValue;
	}
	
	/**
     * Get current state name.
     */
	public String getStateName() {
		return state.stateName;
	}
	
	/**
     * Jump to the next state.
     */
	public void jumpState() {
		state.jumpState(this);
	}
}
