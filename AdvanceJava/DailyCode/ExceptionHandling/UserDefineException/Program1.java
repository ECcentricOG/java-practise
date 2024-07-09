class DataOverFlowException extends RuntimeException {

	DataOverFlowException(String msg) {

		super(msg);
	}
}

class DataUnderFlowException extends RuntimeException{

	DataUnderFlowException(String msg) {

		super(msg);
	}
}

class Clinet {

	public static void main(String [] args) {

		for(int i=0;i<=11;i++) {

			if(i>10) {

				throw new DataOverFlowException("Value is Greater than 10");
			}else if(i < 0) {

				throw new DataUnderFlowException("Value is Less than 0");
			}
		}
	}
}
