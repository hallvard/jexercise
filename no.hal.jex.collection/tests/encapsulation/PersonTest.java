package encapsulation;

import java.util.Date;
import java.util.Random;

import junit.framework.TestCase;
import no.hal.jex.runtime.JExercise;
import no.hal.jex.standalone.JexStandalone;

@JExercise(
	description="A Person must contain a name, an email, a birthday and gender. These attributes should be properly encapsulated and have getters and setters that ensure valid attributes"
)
public class PersonTest extends TestCase {

	private Person person;
	private Date birthday;

	@SuppressWarnings("deprecation")
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		person = new Person();
	}
	
	private void testExceptionAndValue(Exception e, Class<? extends Exception> c, Object expected, Object actual) {
		assertTrue(e + " should be assignable to " + c, c.isAssignableFrom(e.getClass()));
		assertEquals(expected, actual);
	}
	
	@JExercise(
			tests="setName(String)",
			description="The setName(String) sets the name to the argument string, given that the name is within a valid format"
	)
	public void testSetName() {
		String name = person.getName();
		testInvalidName("Ola", name);
		testInvalidName("O N", name);
		testInvalidName("Ola Mellom Nordmann", name);
		testInvalidName("O. Nordmann", name);
		try {
			person.setName("Espen Askeladd");
			assertEquals("Espen Askeladd", person.getName());
		} catch (Exception e) {
			fail("Espen Askeladd is a valid name");
		}
	}

	private void testInvalidName(String invalidName, String existingName) {
		try {
			person.setName(invalidName);
			fail(invalidName + " is an invalid name");
		} catch (Exception e) {
			testExceptionAndValue(e, IllegalArgumentException.class, existingName, person.getName());			
		}
	}

	@JExercise(
		tests="void setBirthday(Date)",
		description="The setBirthday(Date) should set birthday to input argument, given that the birthday is on a valid format."
	)
	public void testSetBirthday() {
		long today = new Date().getTime();
		long offset = 1000L * 60L * 60L * 24L * 100L; // About 100 days
		try {
			Date theFuture = new Date(today + offset);
			person.setBirthday(theFuture);
			fail("The birthday cannot be in the future");
		} catch (Exception e) {
			testExceptionAndValue(e, IllegalArgumentException.class, birthday, person.getBirthday());
		}
		Date thePast = new Date(today - offset);
		try {
			person.setBirthday(thePast);
			assertEquals(thePast, person.getBirthday());
		} catch (Exception e) {
			fail(thePast + " is a valid birthday");
		}
	}
	
	@JExercise(
			tests="void setEmail(String)",
			description="The setEmail(String) should set email to input argument, given that the email is on a valid format"
	)
	public void testSetEmail() {
		person.setName("Ola Nordmann");
		String email = person.getEmail();
		testInvalidEmail("ola.nordmann@ntnu", email, IllegalArgumentException.class);
		testInvalidEmail("ola.nordmann(at)ntnu.no", email, IllegalArgumentException.class);
		testInvalidEmail("espen.askeladd@eventyr.no", email, IllegalArgumentException.class);
		try {
			person.setEmail("ola.nordmann@ntnu.no");
			assertEquals("ola.nordmann@ntnu.no", person.getEmail());
		} catch (Exception e) {
			fail("ola.nordmann@ntnu.no is a valid email");
		}
	}

	private void testInvalidEmail(String invalidEmail, String existingEmail, Class<? extends Exception> ex) {
		try {
			person.setEmail(invalidEmail);
			fail(invalidEmail + " is an invalid email");
		} catch (Exception e) {
			testExceptionAndValue(e, ex, existingEmail, person.getEmail());
		}
	}

	@JExercise(
			tests="void setEmail(String)",
			description="The setEmail(String) should set email to input argument, given that the email is on a vaild format. Tests for valid domains with valid cTLDs"
	)
	public void testExtraCountryTopLevelDomains(){
		String[] cTLDs = {"ad", "ae", "af", "ag", "ai", "al", "am", "ao", "aq", "ar", "as", "at", "au", "aw", "ax", "az", "ba", "bb", "bd", "be", "bf", "bg", "bh", "bi", "bj", "bl", "bm", "bn", "bo", "bq", "br", "bs", "bt", "bv", "bw", "by", "bz", "ca", "cc", "cd", "cf", "cg", "ch", "ci", "ck", "cl", "cm", "cn", "co", "cr", "cu", "cv", "cw", "cx", "cy", "cz", "de", "dj", "dk", "dm", "do", "dz", "ec", "ee", "eg", "eh", "er", "es", "et", "fi", "fj", "fk", "fm", "fo", "fr", "ga", "gb", "gd", "ge", "gf", "gg", "gh", "gi", "gl", "gm", "gn", "gp", "gq", "gr", "gs", "gt", "gu", "gw", "gy", "hk", "hm", "hn", "hr", "ht", "hu", "id", "ie", "il", "im", "in", "io", "iq", "ir", "is", "it", "je", "jm", "jo", "jp", "ke", "kg", "kh", "ki", "km", "kn", "kp", "kr", "kw", "ky", "kz", "la", "lb", "lc", "li", "lk", "lr", "ls", "lt", "lu", "lv", "ly", "ma", "mc", "md", "me", "mf", "mg", "mh", "mk", "ml", "mm", "mn", "mo", "mp", "mq", "mr", "ms", "mt", "mu", "mv", "mw", "mx", "my", "mz", "na", "nc", "ne", "nf", "ng", "ni", "nl", "no", "np", "nr", "nu", "nz", "om", "pa", "pe", "pf", "pg", "ph", "pk", "pl", "pm", "pn", "pr", "ps", "pt", "pw", "py", "qa", "re", "ro", "rs", "ru", "rw", "sa", "sb", "sc", "sd", "se", "sg", "sh", "si", "sj", "sk", "sl", "sm", "sn", "so", "sr", "ss", "st", "sv", "sx", "sy", "sz", "tc", "td", "tf", "tg", "th", "tj", "tk", "tl", "tm", "tn", "to", "tr", "tt", "tv", "tw", "tz", "ua", "ug", "um", "us", "uy", "uz", "va", "vc", "ve", "vg", "vi", "vn", "vu", "wf", "ws", "ye", "yt", "za", "zm", "zw"};
		String[] invalidCTLDs = {"aa", "ab", "ac", "ah", "aj", "ak", "an", "ap", "av", "ay", "bc", "bk", "bp", "bu", "bx", "cb", "ce", "cj", "cp", "cq", "cs", "ct", "da", "db", "dc", "dd", "df", "dg", "dh", "di", "dl", "dn", "dp", "dq", "dr", "ds", "dt", "du", "dv", "dw", "dx", "dy", "ea", "eb", "ed", "ef", "ei", "ej", "ek", "el", "em", "en", "eo", "ep", "eq", "eu", "ev", "ew", "ex", "ey", "ez", "fa", "fb", "fc", "fd", "fe", "ff", "fg", "fh", "fl", "fn", "fp", "fq", "fs", "ft", "fu", "fv", "fw", "fx", "fy", "fz", "gc", "gj", "gk", "go", "gv", "gx", "gz", "ha", "hb", "hc", "hd", "he", "hf", "hg", "hh", "hi", "hj", "hl", "ho", "hp", "hq", "hs", "hv", "hw", "hx", "hy", "hz", "ia", "ib", "ic", "if", "ig", "ih", "ii", "ij", "ik", "ip", "iu", "iv", "iw", "ix", "iy", "iz", "ja", "jb", "jc", "jd", "jf", "jg", "jh", "ji", "jj", "jk", "jl", "jn", "jq", "jr", "js", "jt", "ju", "jv", "jw", "jx", "jy", "jz", "ka", "kb", "kc", "kd", "kf", "kj", "kk", "kl", "ko", "kq", "ks", "kt", "ku", "kv", "kx", "ld", "le", "lf", "lg", "lh", "lj", "ll", "lm", "ln", "lo", "lp", "lq", "lw", "lx", "lz", "mb", "mi", "mj", "nb", "nd", "nh", "nj", "nk", "nm", "nn", "nq", "ns", "nt", "nv", "nw", "nx", "ny", "oa", "ob", "oc", "od", "oe", "of", "og", "oh", "oi", "oj", "ok", "ol", "on", "oo", "op", "oq", "or", "os", "ot", "ou", "ov", "ow", "ox", "oy", "oz", "pb", "pc", "pd", "pi", "pj", "po", "pp", "pq", "pu", "pv", "px", "pz", "qb", "qc", "qd", "qe", "qf", "qg", "qh", "qi", "qj", "qk", "ql", "qm", "qn", "qo", "qp", "qq", "qr", "qs", "qt", "qu", "qv", "qw", "qx", "qy", "qz", "ra", "rb", "rc", "rd", "rf", "rg", "rh", "ri", "rj", "rk", "rl", "rm", "rn", "rp", "rq", "rr", "rt", "rv", "rx", "ry", "rz", "sf", "sp", "sq", "su", "sw", "ta", "tb", "te", "ti", "tp", "tq", "ts", "tu", "tx", "ty", "ub", "uc", "ud", "ue", "uf", "uh", "ui", "uj", "uk", "ul", "un", "uo", "up", "uq", "ur", "ut", "uu", "uv", "uw", "ux", "vb", "vd", "vf", "vh", "vj", "vk", "vl", "vm", "vo", "vp", "vq", "vr", "vs", "vt", "vv", "vw", "vx", "vy", "vz", "wa", "wb", "wc", "wd", "we", "wg", "wh", "wi", "wj", "wk", "wl", "wm", "wn", "wo", "wp", "wq", "wr", "wt", "wu", "wv", "ww", "wx", "wy", "wz", "xa", "xb", "xc", "xd", "xe", "xf", "xg", "xh", "xi", "xj", "xk", "xl", "xm", "xn", "xo", "xp", "xq", "xr", "xs", "xt", "xu", "xv", "xw", "xx", "xy", "xz", "ya", "yb", "yc", "yd", "yf", "yg", "yh", "yi", "yj", "yk", "yl", "ym", "yn", "yo", "yp", "yq", "yr", "ys", "yu", "yv", "yw", "yx", "yy", "yz", "zb", "zc", "zd", "ze", "zf", "zg", "zh", "zi", "zj", "zk", "zl", "zn", "zo", "zp", "zq", "zr", "zs", "zt", "zu", "zv", "zx", "zy", "zz"};
		person.setName("John Doe");
		String email = person.getEmail();

		for (String cTLD : invalidCTLDs) {
			testInvalidEmail("john.doe@ntnu." + cTLD, email, IllegalArgumentException.class);
		}

		for (String cTLD : cTLDs) {
			email = "john.doe@" + generateValidDomain() + "." + cTLD;
			try {
				person.setEmail(email);
				assertEquals(email, person.getEmail());
			} catch (Exception e) {
				fail(email + " is a valid email");
			}
		}
	}

	private String generateValidDomain() {
		Random random = new Random();
		int length = random.nextInt(63) + 1;
		String validCharacters = "abcdefghijklmnopqrstuvwxyz0123456789";
		String domain = "";
		for (int currentChar = 0; currentChar < length; currentChar++) {
			int character = random.nextInt(36);
			domain += validCharacters.substring(character, character + 1);
		}
		return domain;
	}

	@JExercise(
			tests="void setGender(char)",
			description="The setGender(char) should set gender to input argument, given that the gender is on a valid format"
	)	
	public void testSetGender() {
		String validGenders = "FM\0";
		char gender = person.getGender();
		for (char c = '\0'; c < '\uFFFF'; c++) {
			try {
				person.setGender(c);
				if (validGenders.indexOf(c) < 0) {
					fail(c + " is an invalid gender");
				}
				gender = person.getGender();
			} catch(Exception e) {
				if (validGenders.indexOf(c) >= 0) {
					fail("F, M and \\0 are valid genders");
				} else {
					testExceptionAndValue(e, IllegalArgumentException.class, gender, person.getGender());
				}
			}
		}
	}
	
	public static void main(String[] args) {
		JexStandalone.main(PersonTest.class);
	}
}
