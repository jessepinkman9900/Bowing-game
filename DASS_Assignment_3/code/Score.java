/**
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 */

public class Score {

    private String nick;
    private String date;
    private String score;

    public Score( String nick, String date, String score ) {
		this.nick=nick;
		this.date=date;
		this.score=score;
    }

// --Commented out by Inspection START (08/04/20, 11:43 PM):
//    public String getNickName() {
//        return nick;
//    }
// --Commented out by Inspection STOP (08/04/20, 11:43 PM)

	public String getDate() {
		return date;
	}
	
	public String getScore() {
		return score;
	}

	@Override
	public String toString() {
		return nick + "\t" + date + "\t" + score;
	}
	public String toSpaceString() {
		return nick + "    " + date + "    " + score;
	}

}
