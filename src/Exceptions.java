
/**
Exceptions: errors that occur when program runs

1) Runtime exceptions
2) Checked exceptions
3) Fatal errors
**/

//                      Category 1
/**
Runtime Exceptions: Errors that are the result of programmer mistake

NullPointer exception: program tries to access a null object.
	Room r;
	r.getExit('e'); *r is null

IndexOutofBounds exception: self explanatory

ConcurrentModification exception: iterations being modified when they shouldn't have.

ClassCast exception:
**/

//                       Category 2
/**
Checked Exceptions: Errors that are the result of system or user error - not programmer error.

FileNotFound exception: Program must detect and deal with these exceptions.

10Exception:

Interrupted Exception:
**/

//                       Category 3
/**
Fatal error: These will cause program to crash

OutOfMemory Error:

StackOverflow Error:
**/

//_______________________________________________________________________________________________________________

//Exceptions are objects in Java
/**
public class CantGoThatWayException extends RuntimeException {
	public CantGoThatWayException(String error){
		super(error);
	}
}
**/
//Program can throw an exception when it detects an error:
//	throw new CantgoThatWayException("wrong  way");

//Program can catch an exception using a try-catch block
//	try {
//	*code that may trigger an exception*
//	} catch(*Exception*) {
// 	*code to deal with caught exception*
//	}
