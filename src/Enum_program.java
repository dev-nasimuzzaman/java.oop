/*______________________________________________________________________________________________________________________
Author: [Md Nasimuzzaman]
Created On: [December 27, 2024]
GitHub: [https://github.com/dev-nasimuzzaman]

Description:
[An enum type is a special data type that enables for a variable to be a set of predefined constants. The variable must
be equal to one of the values that have been predefined for it. Common examples include compass directions (values of
NORTH, SOUTH, EAST, and WEST) and the days of the week.]

Modification History:
Date           Author            Description
------------   ---------------   ---------------------------------------------------------------------------------------
[12/27/2024]   Md Nasimuzzaman   Initial version of the code.
________________________________________________________________________________________________________________________
*/

//Enum Creation
public class Enum_program {
enum Level{
    LOW,
    MEDIUM,
    HIGH
}
    public static void main(String[] args){
        Level myVar = Level.MEDIUM;
        Level myVar1 = Level.HIGH;
        Level myVar2 = Level.LOW;

        System.out.println(myVar);
        System.out.println(myVar1);
        System.out.println(myVar2);
    }
}
