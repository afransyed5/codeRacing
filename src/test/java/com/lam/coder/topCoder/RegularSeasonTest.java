package com.lam.coder.topCoder;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.RegularSeason;

public class RegularSeasonTest {
	RegularSeason season;

	@Before
	public void setUp() throws Exception {
		season = new RegularSeason();
	}

	@After
	public void tearDown() throws Exception {
		season = null;
	}

	@Test
	public void testFinalStandings() {
		Assert.assertArrayEquals(
				new String[] { "B 19", "A 6", "C 6" },
				season.finalStandings(new String[] { "A 0 10 50",
						"B 100 0 100", "C 50 10 0" }, 5));
		 Assert.assertArrayEquals(new String[] { "SPURS 8",  "LAKERS 7",  "WOLVES 7",  "KINGS 3" }, season.finalStandings( new
		 String[] {"SPURS 0 33 67 100",
				 "LAKERS 67 0 33 100",
				 "WOLVES 33 67 0 100",
				 "KINGS 0 75 75 0"}, 2));
		 Assert.assertArrayEquals(new String[] { "A 90",
				 "AA 90",
				 "AAA 90",
				 "AAAA 90",
				 "AAAAA 90",
				 "AAAAAA 90",
				 "AAAAAAA 90",
				 "AAAAAAAA 90",
				 "AAAAAAAAA 90",
				 "AAAAAAAAAA 90" }, season.finalStandings( new
		 String[] {"A 0 10 20 30 40 50 60 70 80 90",
				 "AA 90 0 10 20 30 40 50 60 70 80",
				 "AAA 80 90 0 10 20 30 40 50 60 70",
				 "AAAA 70 80 90 0 10 20 30 40 50 60",
				 "AAAAA 60 70 80 90 0 10 20 30 40 50",
				 "AAAAAA 50 60 70 80 90 0 10 20 30 40",
				 "AAAAAAA 40 50 60 70 80 90 0 10 20 30",
				 "AAAAAAAA 30 40 50 60 70 80 90 0 10 20",
				 "AAAAAAAAA 20 30 40 50 60 70 80 90 0 10",
				 "AAAAAAAAAA 10 20 30 40 50 60 70 80 90 0"}, 10));
		 Assert.assertArrayEquals(new String[] { "SKGAN 99",
				 "WF 93",
				 "B 92",
				 "LCG 84",
				 "YVN 80",
				 "OZ 76",
				 "GDDYC 72",
				 "C 63",
				 "XK 62" }, season.finalStandings( new
		 String[] {"WF 0 0 71 10 62 87 49 75 50","OZ 38 0 79 55 36 96 63 17 37",
				 "C 13 75 0 96 61 2 33 5 64","LCG 13 85 87 0 60 72 86 1 12",
				 "GDDYC 71 62 21 6 0 17 63 34 32","B 37 66 81 81 53 0 61 80 90",
				 "XK 14 63 40 25 13 86 0 6 43","YVN 57 30 55 22 31 11 81 0 13",
				 "SKGAN 28 79 90 79 75 62 36 86 0"}, 10));
		 Assert.assertArrayEquals(new String[] { "MA 94",
				 "NPT 92",
				 "P 89",
				 "JVY 84",
				 "SJKB 77",
				 "ZSN 75",
				 "EBIUF 74",
				 "HH 74",
				 "ZBOW 61" }, season.finalStandings( new
		 String[] {
				 "ZSN 0 61 70 44 69 40 84 59 20",
				 "SJKB 95 0 88 39 99 18 90 58 44",
				 "EBIUF 63 71 0 5 28 26 41 90 71",
				 "MA 73 90 39 0 40 91 31 39 57",
				 "NPT 35 74 75 74 0 74 14 20 27",
				 "JVY 68 92 37 52 11 0 91 20 52",
				 "ZBOW 66 44 69 9 8 7 0 2 35",
				 "HH 31 70 14 39 6 68 73 0 20",
				 "P 70 62 66 54 9 55 5 98 0"}, 10));
	}
	
	@Test
	public void finalStandingsSystemTest() {
		Assert.assertArrayEquals(new String[] { "B 19", "A 6", "C 6"}, season.finalStandings(new String[] {"A 0 10 50", "B 100 0 100", "C 50 10 0"}, 5));
		Assert.assertArrayEquals(new String[] { "SPURS 8", "LAKERS 7", "WOLVES 7", "KINGS 3"}, season.finalStandings(new String[] {"SPURS 0 33 67 100", "LAKERS 67 0 33 100", "WOLVES 33 67 0 100", "KINGS 0 75 75 0"}, 2));
		Assert.assertArrayEquals(new String[] { "A 90", "AA 90", "AAA 90", "AAAA 90", "AAAAA 90", "AAAAAA 90", "AAAAAAA 90", "AAAAAAAA 90", "AAAAAAAAA 90", "AAAAAAAAAA 90"}, season.finalStandings(new String[] {"A 0 10 20 30 40 50 60 70 80 90", "AA 90 0 10 20 30 40 50 60 70 80", "AAA 80 90 0 10 20 30 40 50 60 70", "AAAA 70 80 90 0 10 20 30 40 50 60", "AAAAA 60 70 80 90 0 10 20 30 40 50", "AAAAAA 50 60 70 80 90 0 10 20 30 40", "AAAAAAA 40 50 60 70 80 90 0 10 20 30", "AAAAAAAA 30 40 50 60 70 80 90 0 10 20", "AAAAAAAAA 20 30 40 50 60 70 80 90 0 10", "AAAAAAAAAA 10 20 30 40 50 60 70 80 90 0"}, 10));
		Assert.assertArrayEquals(new String[] { "P 52", "PPERLJ 49", "DAAJN 36", "MG 31", "UNHWSYYO 12"}, season.finalStandings(new String[] {"DAAJN 0 56 19 81 59", "PPERLJ 48 0 35 90 83", "P 75 17 0 86 71", "UNHWSYYO 51 30 1 0 9", "MG 36 14 16 99 0"}, 9));
		Assert.assertArrayEquals(new String[] { "BZRDW 9", "MDJVANRL 8", "IMJWIL 7", "ORT 7", "ZHT 7", "PEEVMENTK 6", "FTVKNX 6", "YX 6"}, season.finalStandings(new String[] {"BZRDW 0 78 85 100 100 61 39 26", "PEEVMENTK 30 0 84 2 37 9 68 5", "ORT 0 92 0 27 27 59 69 84", "MDJVANRL 73 48 20 0 75 47 46 95", "YX 75 10 60 38 0 74 61 57", "IMJWIL 36 15 22 42 81 0 52 99", "ZHT 75 34 17 66 49 6 0 70", "FTVKNX 50 14 95 14 91 69 30 0"}, 1));
		Assert.assertArrayEquals(new String[] { "VLEA 90", "QQYRHOHO 90", "BXQLAGK 83", "BI 74", "VTWXXNLC 70", "CZTDLSZ 68", "UBCKRUE 66", "FHUIM 64", "Z 59", "UAVDQOZ 55"}, season.finalStandings(new String[] {"VTWXXNLC 0 23 77 37 87 11 73 63 90 18", "VLEA 54 0 91 78 97 19 91 80 96 85", "UBCKRUE 89 63 0 18 62 26 25 73 79 17", "BI 72 48 8 0 81 86 12 31 57 47", "Z 76 19 73 100 0 1 65 69 17 7", "BXQLAGK 27 68 84 56 37 0 78 23 64 23", "UAVDQOZ 20 98 28 2 77 15 0 4 0 35", "FHUIM 65 34 41 42 9 55 70 0 34 66", "CZTDLSZ 88 54 57 5 47 26 43 87 0 49", "QQYRHOHO 8 57 71 78 87 85 29 87 65 0"}, 8));
		Assert.assertArrayEquals(new String[] { "CXVL 73", "WT 68", "XQQNTTYM 62", "BU 54", "BEFDPDQPRT 53", "RHVJZUFEKE 49", "K 47", "FYEJHD 42"}, season.finalStandings(new String[] {"XQQNTTYM 0 55 49 96 67 77 62 45", "CXVL 80 0 75 99 20 63 91 59", "WT 92 51 0 49 45 89 94 18", "K 25 20 73 0 95 63 4 64", "BEFDPDQPRT 3 56 54 45 0 6 100 12", "RHVJZUFEKE 60 5 17 66 33 0 31 66", "FYEJHD 41 43 22 68 16 50 0 51", "BU 81 43 0 34 37 12 83 0"}, 8));
		Assert.assertArrayEquals(new String[] { "CMJM 112", "WTEIC 109", "QRUD 109", "HEC 104", "WXP 101", "Q 101", "OLKHM 101", "NJRN 100", "DIT 99", "BRZI 93", "SHYDB 92", "VY 91", "XO 90", "RICNF 85", "NPYB 82"}, season.finalStandings(new String[] {"QRUD 0 93 54 14 46 23 87 21 78 85 100 100 61 39 26", "WXP 30 0 84 2 37 9 68 5 0 92 27 27 59 69 84", "BRZI 73 48 0 20 75 47 46 95 75 10 60 38 74 61 57", "HEC 36 15 22 0 42 81 52 99 75 34 17 66 49 6 70", "WTEIC 50 14 95 14 0 91 69 30 43 7 97 69 15 88 82", "Q 58 19 17 82 48 0 15 50 73 40 28 57 68 76 72", "OLKHM 48 12 37 84 3 52 0 66 43 10 95 93 55 34 47", "DIT 37 85 32 46 27 99 30 0 74 57 19 76 84 40 50", "VY 89 2 100 57 5 53 19 85 0 63 66 19 85 12 11", "SHYDB 75 31 95 28 33 14 74 84 71 0 60 75 25 14 0", "NPYB 6 81 86 21 11 55 1 11 45 75 0 69 54 7 44", "RICNF 20 70 29 44 23 58 53 63 16 50 97 0 70 93 19", "XO 33 18 100 46 100 9 63 9 44 94 4 90 0 29 22", "CMJM 77 41 20 63 61 45 47 60 64 86 83 63 72 0 57", "NJRN 37 18 74 56 91 24 19 61 70 59 35 49 8 74 0"}, 7));
		Assert.assertArrayEquals(new String[] { "SKGAN 99", "WF 93", "B 92", "LCG 84", "YVN 80", "OZ 76", "GDDYC 72", "C 63", "XK 62"}, season.finalStandings(new String[] {"WF 0 0 71 10 62 87 49 75 50", "OZ 38 0 79 55 36 96 63 17 37", "C 13 75 0 96 61 2 33 5 64", "LCG 13 85 87 0 60 72 86 1 12", "GDDYC 71 62 21 6 0 17 63 34 32", "B 37 66 81 81 53 0 61 80 90", "XK 14 63 40 25 13 86 0 6 43", "YVN 57 30 55 22 31 11 81 0 13", "SKGAN 28 79 90 79 75 62 36 86 0"}, 10));
		Assert.assertArrayEquals(new String[] { "E 68", "AU 61", "YFUQR 61", "KYO 58", "PB 57", "DQ 50", "B 50", "LXRDQ 50", "NGK 49"}, season.finalStandings(new String[] {"DQ 0 24 59 25 69 95 43 89 0", "YFUQR 95 0 60 79 58 14 22 38 0", "LXRDQ 42 8 0 66 86 6 81 66 69", "KYO 81 53 69 0 14 69 73 78 3", "NGK 87 65 71 8 0 55 95 5 27", "AU 14 99 62 29 93 0 37 70 22", "B 15 24 52 91 10 91 0 44 8", "PB 78 17 98 78 87 21 46 0 0", "E 75 11 40 31 100 3 25 19 0"}, 7));
		Assert.assertArrayEquals(new String[] { "MA 94", "NPT 92", "P 89", "JVY 84", "SJKB 77", "ZSN 75", "EBIUF 74", "HH 74", "ZBOW 61"}, season.finalStandings(new String[] {"ZSN 0 61 70 44 69 40 84 59 20", "SJKB 95 0 88 39 99 18 90 58 44", "EBIUF 63 71 0 5 28 26 41 90 71", "MA 73 90 39 0 40 91 31 39 57", "NPT 35 74 75 74 0 74 14 20 27", "JVY 68 92 37 52 11 0 91 20 52", "ZBOW 66 44 69 9 8 7 0 2 35", "HH 31 70 14 39 6 68 73 0 20", "P 70 62 66 54 9 55 5 98 0"}, 10));
		Assert.assertArrayEquals(new String[] { "GU 47", "QXEN 40", "UZFXU 40", "WD 37", "G 36"}, season.finalStandings(new String[] {"G 0 3 46 86 94", "GU 40 0 73 61 81", "WD 88 58 0 60 7", "QXEN 80 46 59 0 59", "UZFXU 57 82 67 34 0"}, 10));
		Assert.assertArrayEquals(new String[] { "TYMJ 112", "RTX 89", "Q 88", "LFR 82", "LCWTB 77", "DP 76", "ULA 76", "TXQQN 74", "YBE 73", "HVJZ 71", "FEKE 71", "M 69", "X 68", "JD 67"}, season.finalStandings(new String[] {"LFR 0 89 63 18 62 26 25 73 79 17 72 48 8 81", "M 86 0 12 31 57 47 76 19 73 100 1 65 69 17", "ULA 7 27 0 68 84 56 37 78 23 64 23 20 98 28", "JD 2 77 15 0 4 0 35 65 34 41 42 9 55 70", "TXQQN 34 66 88 54 0 57 5 47 26 43 87 49 8 57", "TYMJ 71 78 87 85 29 0 87 65 75 83 77 88 91 92", "X 52 44 10 35 83 43 0 17 0 66 78 6 9 38", "LCWTB 69 81 15 14 4 34 1 0 98 65 5 92 64 43", "YBE 2 24 39 66 78 2 83 13 0 64 55 99 46 21", "DP 30 78 34 48 61 10 99 76 15 0 46 71 100 78", "Q 64 62 95 69 29 57 29 55 71 24 0 55 49 96", "RTX 67 77 62 45 80 75 99 20 63 91 59 0 92 51", "HVJZ 49 45 89 94 18 25 20 73 95 63 4 64 0 3", "FEKE 56 54 45 6 100 12 60 5 17 66 33 31 66 0"}, 6));
		Assert.assertArrayEquals(new String[] { "D 72", "AISU 64", "ATTF 62", "WCC 60", "ZQH 58", "B 53", "HKMB 51"}, season.finalStandings(new String[] {"HKMB 0 96 19 38 30 12 20", "ATTF 4 0 77 76 88 0 45", "B 43 80 0 46 49 75 24", "AISU 56 9 93 0 90 86 6", "ZQH 49 63 75 76 0 25 91", "WCC 79 20 55 5 52 0 79", "D 71 2 73 55 92 88 0"}, 10));
		Assert.assertArrayEquals(new String[] { "IOZWQ 56", "AO 40", "U 38", "DI 36", "VJ 32", "NGTXF 29", "FYDWX 25", "OU 23"}, season.finalStandings(new String[] {"NGTXF 0 37 82 4 82 24 90 25", "U 27 0 21 23 85 88 89 85", "OU 61 4 0 17 18 35 45 18", "IOZWQ 90 62 55 0 92 52 73 100", "VJ 97 87 84 14 0 37 28 17", "AO 98 74 72 3 65 0 82 74", "DI 82 12 72 37 65 92 0 89", "FYDWX 3 78 45 0 23 42 15 0"}, 5));
		Assert.assertArrayEquals(new String[] { "OBJ 79", "WLY 71", "KJAH 59", "NA 58", "M 58", "YW 51", "WLSIP 44"}, season.finalStandings(new String[] {"M 0 64 56 63 42 1 87", "KJAH 14 0 27 29 68 56 96", "WLY 61 79 0 42 82 74 13", "NA 52 2 0 0 75 33 91", "WLSIP 46 77 5 63 0 2 68", "OBJ 97 50 71 26 83 0 65", "YW 60 26 85 46 75 35 0"}, 10));
		Assert.assertArrayEquals(new String[] { "NO 89", "UXB 89", "YRZG 86", "MJFM 84", "YZ 82", "UQRH 82", "VKORL 80", "JE 75", "FX 72", "PHDF 72", "GXM 71"}, season.finalStandings(new String[] {"UXB 0 58 7 41 30 50 8 88 30 78 94", "VKORL 59 0 21 28 56 88 25 30 73 87 23", "YZ 19 45 0 89 58 2 100 5 62 25 17", "PHDF 11 23 49 0 96 4 8 34 28 52 49", "MJFM 41 93 60 29 0 48 40 96 55 84 80", "YRZG 80 59 87 32 94 0 27 95 72 12 78", "GXM 47 17 2 4 45 87 0 13 1 21 82", "NO 80 78 66 30 78 93 85 0 24 50 2", "JE 7 3 35 72 41 18 30 18 0 75 13", "FX 5 53 36 81 16 90 13 2 18 0 82", "UQRH 25 57 35 54 67 87 94 95 10 15 0"}, 8));
		Assert.assertArrayEquals(new String[] { "IGHBZ 16", "BNH 12", "NQBJY 12", "G 11", "B 9"}, season.finalStandings(new String[] {"BNH 0 72 86 34 4", "G 48 0 2 84 62", "NQBJY 54 61 0 57 78", "IGHBZ 64 70 76 0 87", "B 15 42 79 2 0"}, 3));
		Assert.assertArrayEquals(new String[] { "TWXV 19", "R 18", "PYH 14", "KZCK 14", "VRVA 12", "C 12", "HUDO 12", "EF 11"}, season.finalStandings(new String[] {"C 0 79 65 8 26 13 21 56", "VRVA 18 0 63 10 45 76 33 5", "PYH 28 70 0 88 57 87 8 80", "TWXV 100 64 62 0 60 59 19 98", "HUDO 23 4 24 25 0 41 80 27", "KZCK 90 38 73 20 5 0 61 35", "R 36 67 98 22 90 35 0 96", "EF 67 20 28 35 53 29 22 0"}, 2));
		Assert.assertArrayEquals(new String[] { "UTMVO 30", "YJ 29", "VGCBX 28", "W 28", "QUE 28", "RX 26", "X 26", "MN 26", "JB 25", "KD 25", "LR 25", "PUFLT 23", "TJHFI 23", "ZS 22"}, season.finalStandings(new String[] {"VGCBX 0 77 4 48 5 97 8 57 97 57 88 41 40 41", "X 66 0 83 95 28 0 62 4 66 42 96 61 20 41", "YJ 34 62 0 81 0 10 39 27 31 83 86 31 19 57", "RX 47 100 43 0 37 42 38 58 88 34 39 96 51 42", "LR 61 78 8 15 0 21 8 32 47 63 33 8 62 14", "MN 28 83 44 100 22 0 10 52 26 0 58 77 10 97", "UTMVO 37 91 52 22 30 48 0 31 41 77 85 39 43 73", "JB 74 9 8 76 85 64 36 0 47 9 41 19 34 92", "TJHFI 23 31 15 34 18 27 20 17 0 33 6 50 97 81", "W 45 92 18 48 47 70 25 94 28 0 30 83 82 63", "KD 80 0 26 29 96 86 52 71 25 93 0 49 9 83", "PUFLT 7 28 38 64 52 43 14 98 7 0 92 0 41 76", "QUE 18 10 42 68 53 83 84 27 50 87 15 98 0 54", "ZS 22 6 20 19 19 20 96 59 74 29 68 79 93 0"}, 2));
		Assert.assertArrayEquals(new String[] { "ZMFU 117", "MAR 109", "CG 109", "TXTO 108", "FQODY 106", "THU 105", "QBR 105", "JMZJ 105", "A 105", "JOT 103", "SHOKC 102", "R 102", "CR 99", "NW 83"}, season.finalStandings(new String[] {"NW 0 4 75 3 13 8 55 57 53 22 7 30 6 41", "MAR 13 0 25 82 51 27 99 92 12 28 71 47 29 34", "JOT 53 81 0 52 6 83 55 10 51 95 73 47 45 92", "A 55 36 89 0 66 12 51 11 28 55 79 37 86 75", "THU 46 36 44 59 0 38 63 56 48 84 18 0 11 4", "SHOKC 22 25 41 71 44 0 13 54 86 81 22 93 31 14", "CR 61 1 96 54 39 1 0 23 89 59 15 1 54 92", "R 65 22 40 97 9 40 51 0 33 33 63 25 29 53", "TXTO 90 48 33 68 46 58 41 93 0 12 67 15 24 11", "CG 10 69 83 49 45 65 42 64 10 0 83 37 88 52", "ZMFU 97 39 73 63 37 82 86 6 75 36 0 23 82 79", "JMZJ 27 56 17 12 76 41 28 17 54 24 32 0 22 66", "FQODY 70 67 64 5 33 96 32 31 16 37 27 97 0 23", "QBR 26 63 76 58 27 71 34 72 2 70 63 12 72 0"}, 8));
		Assert.assertArrayEquals(new String[] { "QSM 102", "VQ 90", "ZQI 85", "JO 83", "FW 81", "EQW 80", "GCBD 70", "YTTK 66", "FYT 64"}, season.finalStandings(new String[] {"FW 0 41 23 97 74 34 73 60 62", "FYT 90 0 68 23 10 53 72 57 1", "JO 51 46 0 98 89 70 24 10 26", "YTTK 47 61 4 0 39 11 100 74 4", "ZQI 0 68 96 71 0 75 14 68 61", "QSM 66 98 7 91 86 0 63 89 58", "GCBD 15 90 57 26 17 63 0 84 67", "EQW 86 45 99 66 71 5 82 0 75", "VQ 98 84 31 11 20 29 95 85 0"}, 10));
		Assert.assertArrayEquals(new String[] { "OJSZ 42", "LFCG 37", "HXP 36", "AV 34", "TH 33", "TIGM 27"}, season.finalStandings(new String[] {"TH 0 25 50 70 71 11", "AV 37 0 48 97 9 45", "LFCG 9 52 0 32 79 83", "TIGM 74 56 5 0 18 100", "OJSZ 43 64 72 90 0 85", "HXP 92 48 48 73 76 0"}, 7));
		Assert.assertArrayEquals(new String[] { "YRS 35", "ITP 34", "ZPHM 31", "O 30", "JCB 25", "BHA 25", "AIID 23", "N 21"}, season.finalStandings(new String[] {"JCB 0 80 83 82 42 8 63 99", "AIID 69 0 50 18 57 24 87 29", "ITP 99 82 0 40 32 40 66 94", "YRS 91 28 77 0 53 96 92 64", "BHA 4 26 29 80 0 26 28 35", "ZPHM 92 82 24 32 23 0 97 24", "N 94 82 10 58 22 37 0 19", "O 79 90 31 5 75 72 56 0"}, 4));
		Assert.assertArrayEquals(new String[] { "PFJ 109", "D 106", "MBXK 105", "SRQKW 103", "NGPRQ 99", "LSO 82", "XOVU 81", "OHNFW 78", "UFQNV 73", "ROQZ 64"}, season.finalStandings(new String[] {"MBXK 0 68 73 71 62 12 96 73 5 23", "LSO 50 0 13 98 46 79 61 78 61 84", "PFJ 29 100 0 86 34 15 10 97 98 59", "XOVU 11 6 33 0 40 43 74 81 60 88", "UFQNV 56 91 20 23 0 18 44 32 21 84", "SRQKW 79 86 40 44 95 0 4 79 30 52", "NGPRQ 22 67 29 17 88 47 0 85 92 59", "OHNFW 16 45 68 82 99 97 51 0 8 5", "D 58 87 59 60 58 28 79 39 0 89", "ROQZ 12 97 5 42 34 36 0 32 21 0"}, 10));
		Assert.assertArrayEquals(new String[] { "AAAAAAB 1", "AAAAAAA 1"}, season.finalStandings(new String[] {"AAAAAAA 0 0", "AAAAAAB 1 0"}, 1));
		Assert.assertArrayEquals(new String[] { "A 3", "C 3", "D 3", "B 3"}, season.finalStandings(new String[] {"A 0 52 50 51", "B 48 0 50 51", "C 48 52 0 51", "D 48 52 50 0"}, 1));
		Assert.assertArrayEquals(new String[] { "B 19", "A 6", "C 6"}, season.finalStandings(new String[] {"A 0 10 50", "B 100 0 100", "C 50 10 0"}, 5));
		Assert.assertArrayEquals(new String[] { "SKGAN 99", "WF 93", "B 92", "LCG 84", "YVN 80", "OZ 76", "GDDYC 72", "C 63", "XK 62"}, season.finalStandings(new String[] {"WF 0 0 71 10 62 87 49 75 50", "OZ 38 0 79 55 36 96 63 17 37", "C 13 75 0 96 61 2 33 5 64", "LCG 13 85 87 0 60 72 86 1 12", "GDDYC 71 62 21 6 0 17 63 34 32", "B 37 66 81 81 53 0 61 80 90", "XK 14 63 40 25 13 86 0 6 43", "YVN 57 30 55 22 31 11 81 0 13", "SKGAN 28 79 90 79 75 62 36 86 0"}, 10));
		Assert.assertArrayEquals(new String[] { "ABC 10", "ABD 10"}, season.finalStandings(new String[] {"ABC 0 13", "ABD 12 0"}, 10));
		Assert.assertArrayEquals(new String[] { "C 20", "B 5", "A 5"}, season.finalStandings(new String[] {"A 0 100 1", "B 100 0 2", "C 100 100 0"}, 5));
		Assert.assertArrayEquals(new String[] { "A 15", "B 15", "C 15", "D 15"}, season.finalStandings(new String[] {"A 0 50 50 50", "D 50 0 50 50", "C 50 50 0 50", "B 50 50 50 0"}, 5));
		Assert.assertArrayEquals(new String[] { "C 3", "D 3", "B 3", "A 3"}, season.finalStandings(new String[] {"A 0 52 50 51", "B 54 0 50 51", "C 54 52 0 51", "D 54 52 50 0"}, 1));
		Assert.assertArrayEquals(new String[] { "B 1", "A 1"}, season.finalStandings(new String[] {"A 0 50", "B 51 0"}, 1));
		Assert.assertArrayEquals(new String[] { "B 3", "A 3", "C 1"}, season.finalStandings(new String[] {"A 0 50 80", "B 50 0 90", "C 10 10 0"}, 1));
		Assert.assertArrayEquals(new String[] { "B 19", "C 6", "A 6"}, season.finalStandings(new String[] {"A 0 10 50", "B 100 0 100", "C 50 15 0"}, 5));
		Assert.assertArrayEquals(new String[] { "C 3", "D 3", "A 3", "B 3"}, season.finalStandings(new String[] {"A 0 54 50 51", "B 52 0 50 51", "C 52 54 0 51", "D 52 54 50 0"}, 1));
		Assert.assertArrayEquals(new String[] { "B 19", "A 6", "C 6"}, season.finalStandings(new String[] {"C 0 10 50", "B 100 0 100", "A 50 10 0"}, 5));
		Assert.assertArrayEquals(new String[] { "A 3", "C 1", "B 1"}, season.finalStandings(new String[] {"A 0 100 100", "B 30 0 50", "C 40 50 0"}, 1));
		Assert.assertArrayEquals(new String[] { "B 2", "A 2", "C 2"}, season.finalStandings(new String[] {"A 0 50 53", "B 51 0 55", "C 50 50 0"}, 1));
		Assert.assertArrayEquals(new String[] { "C 2", "A 2", "B 2"}, season.finalStandings(new String[] {"A 0 100 50", "B 70 0 20", "C 70 20 0"}, 1));
		Assert.assertArrayEquals(new String[] { "A 40", "B 40", "C 40", "D 40", "E 40"}, season.finalStandings(new String[] {"B 0 10 10 10 10", "D 10 0 10 10 10", "A 10 10 0 10 10", "E 10 10 10 0 10", "C 10 10 10 10 0"}, 10));
		Assert.assertArrayEquals(new String[] { "B 1", "A 1"}, season.finalStandings(new String[] {"A 0 49", "B 51 0"}, 1));
		Assert.assertArrayEquals(new String[] { "B 1", "A 1"}, season.finalStandings(new String[] {"A 0 51", "B 52 0"}, 1));
	}
}
