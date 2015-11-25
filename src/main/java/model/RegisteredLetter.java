package model;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class RegisteredLetter extends NotUrgentLetter
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public NotUrgentLetter letter;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public RegisteredLetter(Inhabitant sender, Inhabitant receiver, String content){
		super(sender, receiver);
	}

}

