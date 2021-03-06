package com.lam.coder.rosalind;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.rosalind.FromDNAintoRNA;

public class FromDNAintoRNATest {
	FromDNAintoRNA fromDNAintoRNA;
	
	@Before
	public void setUp() throws Exception {
		this.fromDNAintoRNA = new FromDNAintoRNA();
	}

	@After
	public void tearDown() throws Exception {
		this.fromDNAintoRNA  = null;
	}

	@Test
	public void test() {
		Assert.assertEquals("GAUGGAACUUGACUACGUAAAUU", this.fromDNAintoRNA.find("GATGGAACTTGACTACGTAAATT"));
		Assert.assertEquals("AUGACUGUAUCUCCACACACCUUUGCUCCGGCUGGGUGGCCGGGAAUCGUAGCCACGCUUGUUCCAACAGUUUACAAGCUAGCUCGUCCCAUUACAGGCGUUAGAGGUUGGGUCAAUCAGACUAUACUGUCCUGAGCUGACCCCUUGCCUCAACGAAUGAUCAGUCUAGGAAUGUGAUCUUUGAUUACAGCUUAUCAUGACAUUGCCACGAGAAGUAAGUUACCUCGUUAACUUUGAGACCGAAGUGAGCCCUAACCGUUCGUUCGCUAUCAUGGCAGGCUCAAGAUACCCUCACUGGGGCUCCUUUAGUGGGCAUACGAAAACACCUGCGUCACUCGUCAUCCAUAGUGUGUGUCAGACAAUGCACCUCAGUCCAUCUCGUGGUCCCCCCCCCGCAUGAGUAUCCGAACAACCUGUAGUACCCUAAGGCUGCUGAGGACUCCAGUUUUUCUUAACUUGGCACGCGGAUACUUUUUACUGAAAUCCGUUGGUUUGUCCCGCAGAGCAUCUGUGUUUAAUAAUGAACUUCUUGUACUAGCUGCCCCUAUCUCGGGCCUAACAGUUACUCUGACAUCUAAAUUUUCAGCUCGUUCGUCCACUCUGUAGGCCGUCGGAAUCUUCCUAUAAUCCCCACAAUAGUCUGGCUUAUCUCCGUAUCAGCUAGCCGGUCGGCAGUCUGACUAACACCUUACGCUCAAACAAGCAUGAUCUGUGUAACACGACUAGGGUGUCUACUACUACUAACACGUGUCCAACAGUGUCACGUGUUGUCAGCUAUUUCCAGCCGGGUCUGCAAACGGUGUACCUGGUCAUGUUUGCUGUGCUUACAGGAGUUUGCCCUAAUUUCGGGCACGUACUUGACAAAUCGGUUCUACUCGGAAAGGCGAGGUCCUGCUAUUCGUUGCG", 
				this.fromDNAintoRNA.find("ATGACTGTATCTCCACACACCTTTGCTCCGGCTGGGTGGCCGGGAATCGTAGCCACGCTTGTTCCAACAGTTTACAAGCTAGCTCGTCCCATTACAGGCGTTAGAGGTTGGGTCAATCAGACTATACTGTCCTGAGCTGACCCCTTGCCTCAACGAATGATCAGTCTAGGAATGTGATCTTTGATTACAGCTTATCATGACATTGCCACGAGAAGTAAGTTACCTCGTTAACTTTGAGACCGAAGTGAGCCCTAACCGTTCGTTCGCTATCATGGCAGGCTCAAGATACCCTCACTGGGGCTCCTTTAGTGGGCATACGAAAACACCTGCGTCACTCGTCATCCATAGTGTGTGTCAGACAATGCACCTCAGTCCATCTCGTGGTCCCCCCCCCGCATGAGTATCCGAACAACCTGTAGTACCCTAAGGCTGCTGAGGACTCCAGTTTTTCTTAACTTGGCACGCGGATACTTTTTACTGAAATCCGTTGGTTTGTCCCGCAGAGCATCTGTGTTTAATAATGAACTTCTTGTACTAGCTGCCCCTATCTCGGGCCTAACAGTTACTCTGACATCTAAATTTTCAGCTCGTTCGTCCACTCTGTAGGCCGTCGGAATCTTCCTATAATCCCCACAATAGTCTGGCTTATCTCCGTATCAGCTAGCCGGTCGGCAGTCTGACTAACACCTTACGCTCAAACAAGCATGATCTGTGTAACACGACTAGGGTGTCTACTACTACTAACACGTGTCCAACAGTGTCACGTGTTGTCAGCTATTTCCAGCCGGGTCTGCAAACGGTGTACCTGGTCATGTTTGCTGTGCTTACAGGAGTTTGCCCTAATTTCGGGCACGTACTTGACAAATCGGTTCTACTCGGAAAGGCGAGGTCCTGCTATTCGTTGCG"));
	}
}
