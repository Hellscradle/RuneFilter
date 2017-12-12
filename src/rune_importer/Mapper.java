package rune_importer;

import java.util.HashMap;

public class Mapper {
	public static HashMap<String, String> monsterIDmap = new HashMap<String, String>();
	public static HashMap<Integer, String> runeStatMap = new HashMap<Integer, String>();
	public static HashMap<Integer, String> runeSetMap = new HashMap<Integer, String>();
	public static HashMap<Integer, String> runeQualityMap = new HashMap<Integer, String>();
	public static HashMap<Integer, String> monsterElementMap = new HashMap<Integer, String>();


	
	public Mapper(){
		//monster map
		monsterIDmap.put("101", "Fairy");
		monsterIDmap.put("10111", "Elucia");
		monsterIDmap.put("10112", "Iselia");
		monsterIDmap.put("10113", "Aeilene");
		monsterIDmap.put("10114", "Neal");
		monsterIDmap.put("10115", "Sorin");
		monsterIDmap.put("102", "Imp");
		monsterIDmap.put("10211", "Fynn");
		monsterIDmap.put("10212", "Cogma");
		monsterIDmap.put("10213", "Ralph");
		monsterIDmap.put("10214", "Taru");
		monsterIDmap.put("10215", "Garok");
		monsterIDmap.put("103", "Pixie");
		monsterIDmap.put("10311", "Kacey");
		monsterIDmap.put("10312", "Tatu");
		monsterIDmap.put("10313", "Shannon");
		monsterIDmap.put("10314", "Cheryl");
		monsterIDmap.put("10315", "Camaryn");
		monsterIDmap.put("104", "Yeti");
		monsterIDmap.put("10411", "Kunda");
		monsterIDmap.put("10412", "Tantra");
		monsterIDmap.put("10413", "Rakaja");
		monsterIDmap.put("10414", "Arkajan");
		monsterIDmap.put("10415", "Kumae");
		monsterIDmap.put("105", "Harpy");
		monsterIDmap.put("10511", "Ramira");
		monsterIDmap.put("10512", "Lucasha");
		monsterIDmap.put("10513", "Prilea");
		monsterIDmap.put("10514", "Kabilla");
		monsterIDmap.put("10515", "Hellea");
		monsterIDmap.put("106", "Hellhound");
		monsterIDmap.put("10611", "Tarq");
		monsterIDmap.put("10612", "Sieq");
		monsterIDmap.put("10613", "Gamir");
		monsterIDmap.put("10614", "Shamar");
		monsterIDmap.put("10615", "Shumar");
		monsterIDmap.put("107", "Warbear");
		monsterIDmap.put("10711", "Dagora");
		monsterIDmap.put("10712", "Ursha");
		monsterIDmap.put("10713", "Ramagos");
		monsterIDmap.put("10714", "Lusha");
		monsterIDmap.put("10715", "Gorgo");
		monsterIDmap.put("108", "Elemental");
		monsterIDmap.put("10811", "Daharenos");
		monsterIDmap.put("10812", "Bremis");
		monsterIDmap.put("10813", "Taharus");
		monsterIDmap.put("10814", "Priz");
		monsterIDmap.put("10815", "Camules");
		monsterIDmap.put("109", "Garuda");
		monsterIDmap.put("10911", "Konamiya");
		monsterIDmap.put("10912", "Cahule");
		monsterIDmap.put("10913", "Lindermen");
		monsterIDmap.put("10914", "Teon");
		monsterIDmap.put("10915", "Rizak");
		monsterIDmap.put("110", "Inugami");
		monsterIDmap.put("11011", "Icaru");
		monsterIDmap.put("11012", "Raoq");
		monsterIDmap.put("11013", "Ramahan");
		monsterIDmap.put("11014", "Belladeon");
		monsterIDmap.put("11015", "Kro");
		monsterIDmap.put("111", "Salamander");
		monsterIDmap.put("11111", "Kaimann");
		monsterIDmap.put("11112", "Krakdon");
		monsterIDmap.put("11113", "Lukan");
		monsterIDmap.put("11114", "Sharman");
		monsterIDmap.put("11115", "Decamaron");
		monsterIDmap.put("112", "Nine-tailed Fox");
		monsterIDmap.put("11211", "Soha");
		monsterIDmap.put("11212", "Shihwa");
		monsterIDmap.put("11213", "Arang");
		monsterIDmap.put("11214", "Chamie");
		monsterIDmap.put("11215", "Kamiya");
		monsterIDmap.put("113", "Serpent");
		monsterIDmap.put("11311", "Shailoq");
		monsterIDmap.put("11312", "Fao");
		monsterIDmap.put("11313", "Ermeda");
		monsterIDmap.put("11314", "Elpuria");
		monsterIDmap.put("11315", "Mantura");
		monsterIDmap.put("114", "Golem");
		monsterIDmap.put("11411", "Kuhn");
		monsterIDmap.put("11412", "Kugo");
		monsterIDmap.put("11413", "Ragion");
		monsterIDmap.put("11414", "Groggo");
		monsterIDmap.put("11415", "Maggi");
		monsterIDmap.put("115", "Griffon");
		monsterIDmap.put("11511", "Kahn");
		monsterIDmap.put("11512", "Spectra");
		monsterIDmap.put("11513", "Bernard");
		monsterIDmap.put("11514", "Shamann");
		monsterIDmap.put("11515", "Varus");
		monsterIDmap.put("116", "Undine");
		monsterIDmap.put("11611", "Mikene");
		monsterIDmap.put("11612", "Atenai");
		monsterIDmap.put("11613", "Delphoi");
		monsterIDmap.put("11614", "Icasha");
		monsterIDmap.put("11615", "Tilasha");
		monsterIDmap.put("117", "Inferno");
		monsterIDmap.put("11711", "Purian");
		monsterIDmap.put("11712", "Tagaros");
		monsterIDmap.put("11713", "Anduril");
		monsterIDmap.put("11714", "Eludain");
		monsterIDmap.put("11715", "Drogan");
		monsterIDmap.put("118", "Sylph");
		monsterIDmap.put("11811", "Tyron");
		monsterIDmap.put("11812", "Baretta");
		monsterIDmap.put("11813", "Shimitae");
		monsterIDmap.put("11814", "Eredas");
		monsterIDmap.put("11815", "Aschubel");
		monsterIDmap.put("119", "Sylphid");
		monsterIDmap.put("11911", "Lumirecia");
		monsterIDmap.put("11912", "Fria");
		monsterIDmap.put("11913", "Acasis");
		monsterIDmap.put("11914", "Mihael");
		monsterIDmap.put("11915", "Icares");
		monsterIDmap.put("120", "High Elemental");
		monsterIDmap.put("12011", "Ellena");
		monsterIDmap.put("12012", "Kahli");
		monsterIDmap.put("12013", "Moria");
		monsterIDmap.put("12014", "Shren");
		monsterIDmap.put("12015", "Jumaline");
		monsterIDmap.put("121", "Harpu");
		monsterIDmap.put("12111", "Sisroo");
		monsterIDmap.put("12112", "Colleen");
		monsterIDmap.put("12113", "Seal");
		monsterIDmap.put("12114", "Sia");
		monsterIDmap.put("12115", "Seren");
		monsterIDmap.put("122", "Slime");
		monsterIDmap.put("12211", "");
		monsterIDmap.put("12212", "");
		monsterIDmap.put("12213", "");
		monsterIDmap.put("12214", "");
		monsterIDmap.put("12215", "");
		monsterIDmap.put("123", "Forest Keeper");
		monsterIDmap.put("12311", "");
		monsterIDmap.put("12312", "");
		monsterIDmap.put("12313", "");
		monsterIDmap.put("12314", "");
		monsterIDmap.put("12315", "");
		monsterIDmap.put("124", "Mushroom");
		monsterIDmap.put("12411", "");
		monsterIDmap.put("12412", "");
		monsterIDmap.put("12413", "");
		monsterIDmap.put("12414", "");
		monsterIDmap.put("12415", "");
		monsterIDmap.put("125", "Maned Boar");
		monsterIDmap.put("12511", "");
		monsterIDmap.put("12512", "");
		monsterIDmap.put("12513", "");
		monsterIDmap.put("12514", "");
		monsterIDmap.put("12515", "");
		monsterIDmap.put("126", "Monster Flower");
		monsterIDmap.put("12611", "");
		monsterIDmap.put("12612", "");
		monsterIDmap.put("12613", "");
		monsterIDmap.put("12614", "");
		monsterIDmap.put("12615", "");
		monsterIDmap.put("127", "Ghost");
		monsterIDmap.put("12711", "");
		monsterIDmap.put("12712", "");
		monsterIDmap.put("12713", "");
		monsterIDmap.put("12714", "");
		monsterIDmap.put("12715", "");
		monsterIDmap.put("128", "Low Elemental");
		monsterIDmap.put("12811", "Tigresse");
		monsterIDmap.put("12812", "Lamor");
		monsterIDmap.put("12813", "Samour");
		monsterIDmap.put("12814", "Varis");
		monsterIDmap.put("12815", "Havana");
		monsterIDmap.put("129", "Mimick");
		monsterIDmap.put("12911", "");
		monsterIDmap.put("12912", "");
		monsterIDmap.put("12913", "");
		monsterIDmap.put("12914", "");
		monsterIDmap.put("12915", "");
		monsterIDmap.put("130", "Horned Frog");
		monsterIDmap.put("13011", "");
		monsterIDmap.put("13012", "");
		monsterIDmap.put("13013", "");
		monsterIDmap.put("13014", "");
		monsterIDmap.put("13015", "");
		monsterIDmap.put("131", "Sandman");
		monsterIDmap.put("13111", "");
		monsterIDmap.put("13112", "");
		monsterIDmap.put("13113", "");
		monsterIDmap.put("13114", "");
		monsterIDmap.put("13115", "");
		monsterIDmap.put("132", "Howl");
		monsterIDmap.put("13211", "Lulu");
		monsterIDmap.put("13212", "Lala");
		monsterIDmap.put("13213", "Chichi");
		monsterIDmap.put("13214", "Shushu");
		monsterIDmap.put("13215", "Chacha");
		monsterIDmap.put("133", "Succubus");
		monsterIDmap.put("13311", "Izaria");
		monsterIDmap.put("13312", "Akia");
		monsterIDmap.put("13313", "Selena");
		monsterIDmap.put("13314", "Aria");
		monsterIDmap.put("13315", "Isael");
		monsterIDmap.put("134", "Joker");
		monsterIDmap.put("13411", "Sian");
		monsterIDmap.put("13412", "Jojo");
		monsterIDmap.put("13413", "Lushen");
		monsterIDmap.put("13414", "Figaro");
		monsterIDmap.put("13415", "Liebli");
		monsterIDmap.put("135", "Ninja");
		monsterIDmap.put("13511", "Susano");
		monsterIDmap.put("13512", "Garo");
		monsterIDmap.put("13513", "Orochi");
		monsterIDmap.put("13514", "Gin");
		monsterIDmap.put("13515", "Han");
		monsterIDmap.put("136", "Surprise Box");
		monsterIDmap.put("13611", "");
		monsterIDmap.put("13612", "");
		monsterIDmap.put("13613", "");
		monsterIDmap.put("13614", "");
		monsterIDmap.put("13615", "");
		monsterIDmap.put("137", "Bearman");
		monsterIDmap.put("13711", "Gruda");
		monsterIDmap.put("13712", "Kungen");
		monsterIDmap.put("13713", "Dagorr");
		monsterIDmap.put("13714", "Ahman");
		monsterIDmap.put("13715", "Haken");
		monsterIDmap.put("138", "Valkyrja");
		monsterIDmap.put("13811", "Camilla");
		monsterIDmap.put("13812", "Vanessa");
		monsterIDmap.put("13813", "Katarina");
		monsterIDmap.put("13814", "Akroma");
		monsterIDmap.put("13815", "Trinity");
		monsterIDmap.put("139", "Pierret");
		monsterIDmap.put("13911", "Julie");
		monsterIDmap.put("13912", "Clara");
		monsterIDmap.put("13913", "Sophia");
		monsterIDmap.put("13914", "Eva");
		monsterIDmap.put("13915", "Luna");
		monsterIDmap.put("140", "Werewolf");
		monsterIDmap.put("14011", "Vigor");
		monsterIDmap.put("14012", "Garoche");
		monsterIDmap.put("14013", "Shakan");
		monsterIDmap.put("14014", "Eshir");
		monsterIDmap.put("14015", "Jultan");
		monsterIDmap.put("141", "Phantom Thief");
		monsterIDmap.put("14111", "Luer");
		monsterIDmap.put("14112", "Jean");
		monsterIDmap.put("14113", "Julien");
		monsterIDmap.put("14114", "Louis");
		monsterIDmap.put("14115", "Guillaume");
		monsterIDmap.put("142", "Angelmon");
		monsterIDmap.put("14211", "Blue Angelmon");
		monsterIDmap.put("14212", "Red Angelmon");
		monsterIDmap.put("14213", "Gold Angelmon");
		monsterIDmap.put("14214", "White Angelmon");
		monsterIDmap.put("14215", "Dark Angelmon");
		monsterIDmap.put("144", "Dragon");
		monsterIDmap.put("14411", "Verad");
		monsterIDmap.put("14412", "Zaiross");
		monsterIDmap.put("14413", "Jamire");
		monsterIDmap.put("14414", "Zerath");
		monsterIDmap.put("14415", "Grogen");
		monsterIDmap.put("145", "Phoenix");
		monsterIDmap.put("14511", "Sigmarus");
		monsterIDmap.put("14512", "Perna");
		monsterIDmap.put("14513", "Teshar");
		monsterIDmap.put("14514", "Eludia");
		monsterIDmap.put("14515", "Jaara");
		monsterIDmap.put("146", "Chimera");
		monsterIDmap.put("14611", "Taor");
		monsterIDmap.put("14612", "Rakan");
		monsterIDmap.put("14613", "Lagmaron");
		monsterIDmap.put("14614", "Shan");
		monsterIDmap.put("14615", "Zeratu");
		monsterIDmap.put("147", "Vampire");
		monsterIDmap.put("14711", "Liesel");
		monsterIDmap.put("14712", "Verdehile");
		monsterIDmap.put("14713", "Argen");
		monsterIDmap.put("14714", "Julianne");
		monsterIDmap.put("14715", "Cadiz");
		monsterIDmap.put("148", "Viking");
		monsterIDmap.put("14811", "Huga");
		monsterIDmap.put("14812", "Geoffrey");
		monsterIDmap.put("14813", "Walter");
		monsterIDmap.put("14814", "Jansson");
		monsterIDmap.put("14815", "Janssen");
		monsterIDmap.put("149", "Amazon");
		monsterIDmap.put("14911", "Ellin");
		monsterIDmap.put("14912", "Ceres");
		monsterIDmap.put("14913", "Hina");
		monsterIDmap.put("14914", "Lyn");
		monsterIDmap.put("14915", "Mara");
		monsterIDmap.put("150", "Martial Cat");
		monsterIDmap.put("15011", "Mina");
		monsterIDmap.put("15012", "Mei");
		monsterIDmap.put("15013", "Naomi");
		monsterIDmap.put("15014", "Xiao Ling");
		monsterIDmap.put("15015", "Miho");
		monsterIDmap.put("152", "Vagabond");
		monsterIDmap.put("15211", "Allen");
		monsterIDmap.put("15212", "Kai'en");
		monsterIDmap.put("15213", "Roid");
		monsterIDmap.put("15214", "Darion");
		monsterIDmap.put("15215", "Jubelle");
		monsterIDmap.put("153", "Epikion Priest");
		monsterIDmap.put("15311", "Rina");
		monsterIDmap.put("15312", "Chloe");
		monsterIDmap.put("15313", "Michelle");
		monsterIDmap.put("15314", "Iona");
		monsterIDmap.put("15315", "Rasheed");
		monsterIDmap.put("154", "Magical Archer");
		monsterIDmap.put("15411", "Sharron");
		monsterIDmap.put("15412", "Cassandra");
		monsterIDmap.put("15413", "Ardella");
		monsterIDmap.put("15414", "Chris");
		monsterIDmap.put("15415", "Bethony");
		monsterIDmap.put("155", "Rakshasa");
		monsterIDmap.put("15511", "Su");
		monsterIDmap.put("15512", "Hwa");
		monsterIDmap.put("15513", "Yen");
		monsterIDmap.put("15514", "Pang");
		monsterIDmap.put("15515", "Ran");
		monsterIDmap.put("156", "Bounty Hunter");
		monsterIDmap.put("15611", "Wayne");
		monsterIDmap.put("15612", "Randy");
		monsterIDmap.put("15613", "Roger");
		monsterIDmap.put("15614", "Walkers");
		monsterIDmap.put("15615", "Jamie");
		monsterIDmap.put("157", "Oracle");
		monsterIDmap.put("15711", "Praha");
		monsterIDmap.put("15712", "Juno");
		monsterIDmap.put("15713", "Seara");
		monsterIDmap.put("15714", "Laima");
		monsterIDmap.put("15715", "Giana");
		monsterIDmap.put("158", "Imp Champion");
		monsterIDmap.put("15811", "Yaku");
		monsterIDmap.put("15812", "Fairo");
		monsterIDmap.put("15813", "Pigma");
		monsterIDmap.put("15814", "Shaffron");
		monsterIDmap.put("15815", "Loque");
		monsterIDmap.put("159", "Mystic Witch");
		monsterIDmap.put("15911", "Megan");
		monsterIDmap.put("15912", "Rebecca");
		monsterIDmap.put("15913", "Silia");
		monsterIDmap.put("15914", "Linda");
		monsterIDmap.put("15915", "Gina");
		monsterIDmap.put("160", "Grim Reaper");
		monsterIDmap.put("16011", "Hemos");
		monsterIDmap.put("16012", "Sath");
		monsterIDmap.put("16013", "Hiva");
		monsterIDmap.put("16014", "Prom");
		monsterIDmap.put("16015", "Thrain");
		monsterIDmap.put("161", "Occult Girl");
		monsterIDmap.put("16111", "Anavel");
		monsterIDmap.put("16112", "Rica");
		monsterIDmap.put("16113", "Charlotte");
		monsterIDmap.put("16114", "Lora");
		monsterIDmap.put("16115", "Nicki");
		monsterIDmap.put("162", "Death Knight");
		monsterIDmap.put("16211", "Fedora");
		monsterIDmap.put("16212", "Arnold");
		monsterIDmap.put("16213", "Briand");
		monsterIDmap.put("16214", "Conrad");
		monsterIDmap.put("16215", "Dias");
		monsterIDmap.put("163", "Lich");
		monsterIDmap.put("16311", "Rigel");
		monsterIDmap.put("16312", "Antares");
		monsterIDmap.put("16313", "Fuco");
		monsterIDmap.put("16314", "Halphas");
		monsterIDmap.put("16315", "Grego");
		monsterIDmap.put("164", "Skull Soldier");
		monsterIDmap.put("16411", "");
		monsterIDmap.put("16412", "");
		monsterIDmap.put("16413", "");
		monsterIDmap.put("16414", "");
		monsterIDmap.put("16415", "");
		monsterIDmap.put("165", "Living Armor");
		monsterIDmap.put("16511", "Nickel");
		monsterIDmap.put("16512", "Iron");
		monsterIDmap.put("16513", "Copper");
		monsterIDmap.put("16514", "Silver");
		monsterIDmap.put("16515", "Zinc");
		monsterIDmap.put("166", "Dragon Knight");
		monsterIDmap.put("16611", "Chow");
		monsterIDmap.put("16612", "Laika");
		monsterIDmap.put("16613", "Leo");
		monsterIDmap.put("16614", "Jager");
		monsterIDmap.put("16615", "Ragdoll");
		monsterIDmap.put("167", "Magical Archer Promo");
		monsterIDmap.put("16711", "");
		monsterIDmap.put("16712", "");
		monsterIDmap.put("16713", "");
		monsterIDmap.put("16714", "Fami");
		monsterIDmap.put("16715", "");
		monsterIDmap.put("168", "Monkey King");
		monsterIDmap.put("16811", "Shi Hou");
		monsterIDmap.put("16812", "Mei Hou Wang");
		monsterIDmap.put("16813", "Xing Zhe");
		monsterIDmap.put("16814", "Qitian Dasheng");
		monsterIDmap.put("16815", "Son Zhang Lao");
		monsterIDmap.put("169", "Samurai");
		monsterIDmap.put("16911", "Kaz");
		monsterIDmap.put("16912", "Jun");
		monsterIDmap.put("16913", "Kaito");
		monsterIDmap.put("16914", "Tosi");
		monsterIDmap.put("16915", "Sige");
		monsterIDmap.put("170", "Archangel");
		monsterIDmap.put("17011", "Ariel");
		monsterIDmap.put("17012", "Velajuel");
		monsterIDmap.put("17013", "Eladriel");
		monsterIDmap.put("17014", "Artamiel");
		monsterIDmap.put("17015", "Fermion");
		monsterIDmap.put("172", "Drunken Master");
		monsterIDmap.put("17211", "Mao");
		monsterIDmap.put("17212", "Xiao Chun");
		monsterIDmap.put("17213", "Huan");
		monsterIDmap.put("17214", "Tien Qin");
		monsterIDmap.put("17215", "Wei Shin");
		monsterIDmap.put("173", "Kung Fu Girl");
		monsterIDmap.put("17311", "Xiao Lin");
		monsterIDmap.put("17312", "Hong Hua");
		monsterIDmap.put("17313", "Ling Ling");
		monsterIDmap.put("17314", "Liu Mei");
		monsterIDmap.put("17315", "Fei");
		monsterIDmap.put("174", "Beast Monk");
		monsterIDmap.put("17411", "Chandra");
		monsterIDmap.put("17412", "Kumar");
		monsterIDmap.put("17413", "Ritesh");
		monsterIDmap.put("17414", "Shazam");
		monsterIDmap.put("17415", "Rahul");
		monsterIDmap.put("175", "Mischievous Bat");
		monsterIDmap.put("17511", "");
		monsterIDmap.put("17512", "");
		monsterIDmap.put("17513", "");
		monsterIDmap.put("17514", "");
		monsterIDmap.put("17515", "");
		monsterIDmap.put("176", "Battle Scorpion");
		monsterIDmap.put("17611", "");
		monsterIDmap.put("17612", "");
		monsterIDmap.put("17613", "");
		monsterIDmap.put("17614", "");
		monsterIDmap.put("17615", "");
		monsterIDmap.put("177", "Minotauros");
		monsterIDmap.put("17711", "Urtau");
		monsterIDmap.put("17712", "Burentau");
		monsterIDmap.put("17713", "Eintau");
		monsterIDmap.put("17714", "Grotau");
		monsterIDmap.put("17715", "Kamatau");
		monsterIDmap.put("178", "Lizardman");
		monsterIDmap.put("17811", "Kernodon");
		monsterIDmap.put("17812", "Igmanodon");
		monsterIDmap.put("17813", "Velfinodon");
		monsterIDmap.put("17814", "Glinodon");
		monsterIDmap.put("17815", "Devinodon");
		monsterIDmap.put("179", "Hell Lady");
		monsterIDmap.put("17911", "Beth");
		monsterIDmap.put("17912", "Raki");
		monsterIDmap.put("17913", "Ethna");
		monsterIDmap.put("17914", "Asima");
		monsterIDmap.put("17915", "Craka");
		monsterIDmap.put("180", "Brownie Magician");
		monsterIDmap.put("18011", "Orion");
		monsterIDmap.put("18012", "Draco");
		monsterIDmap.put("18013", "Aquila");
		monsterIDmap.put("18014", "Gemini");
		monsterIDmap.put("18015", "Korona");
		monsterIDmap.put("181", "Kobold Bomber");
		monsterIDmap.put("18111", "Malaka");
		monsterIDmap.put("18112", "Zibrolta");
		monsterIDmap.put("18113", "Taurus");
		monsterIDmap.put("18114", "Dover");
		monsterIDmap.put("18115", "Bering");
		monsterIDmap.put("182", "King Angelmon");
		monsterIDmap.put("18211", "Blue King Angelmon");
		monsterIDmap.put("18212", "Red King Angelmon");
		monsterIDmap.put("18213", "Gold King Angelmon");
		monsterIDmap.put("18214", "White King Angelmon");
		monsterIDmap.put("18215", "Dark King Angelmon");
		monsterIDmap.put("183", "Sky Dancer");
		monsterIDmap.put("18311", "Mihyang");
		monsterIDmap.put("18312", "Hwahee");
		monsterIDmap.put("18313", "Chasun");
		monsterIDmap.put("18314", "Yeonhong");
		monsterIDmap.put("18315", "Wolyung");
		monsterIDmap.put("184", "Taoist");
		monsterIDmap.put("18411", "Gildong");
		monsterIDmap.put("18412", "Gunpyeong");
		monsterIDmap.put("18413", "Woochi");
		monsterIDmap.put("18414", "Hwadam");
		monsterIDmap.put("18415", "Woonhak");
		monsterIDmap.put("185", "Beast Hunter");
		monsterIDmap.put("18511", "Gangchun");
		monsterIDmap.put("18512", "Nangrim");
		monsterIDmap.put("18513", "Suri");
		monsterIDmap.put("18514", "Baekdu");
		monsterIDmap.put("18515", "Hannam");
		monsterIDmap.put("186", "Pioneer");
		monsterIDmap.put("18611", "Woosa");
		monsterIDmap.put("18612", "Chiwu");
		monsterIDmap.put("18613", "Pungbaek");
		monsterIDmap.put("18614", "Nigong");
		monsterIDmap.put("18615", "Woonsa");
		monsterIDmap.put("187", "Penguin Knight");
		monsterIDmap.put("18711", "Toma");
		monsterIDmap.put("18712", "Naki");
		monsterIDmap.put("18713", "Mav");
		monsterIDmap.put("18714", "Dona");
		monsterIDmap.put("18715", "Kuna");
		monsterIDmap.put("188", "Barbaric King");
		monsterIDmap.put("18811", "Aegir");
		monsterIDmap.put("18812", "Surtr");
		monsterIDmap.put("18813", "Hraesvelg");
		monsterIDmap.put("18814", "Mimirr");
		monsterIDmap.put("18815", "Hrungnir");
		monsterIDmap.put("189", "Polar Queen");
		monsterIDmap.put("18911", "Alicia");
		monsterIDmap.put("18912", "Brandia");
		monsterIDmap.put("18913", "Tiana");
		monsterIDmap.put("18914", "Elenoa");
		monsterIDmap.put("18915", "Lydia");
		monsterIDmap.put("190", "Battle Mammoth");
		monsterIDmap.put("19011", "Talc");
		monsterIDmap.put("19012", "Granite");
		monsterIDmap.put("19013", "Olivine");
		monsterIDmap.put("19014", "Marble");
		monsterIDmap.put("19015", "Basalt");
		monsterIDmap.put("191", "Fairy Queen");
		monsterIDmap.put("19111", "");
		monsterIDmap.put("19112", "");
		monsterIDmap.put("19113", "");
		monsterIDmap.put("19114", "Fran");
		monsterIDmap.put("19115", "");
		monsterIDmap.put("192", "Ifrit");
		monsterIDmap.put("19211", "Theomars");
		monsterIDmap.put("19212", "Tesarion");
		monsterIDmap.put("19213", "Akhamamir");
		monsterIDmap.put("19214", "Elsharion");
		monsterIDmap.put("19215", "Veromos");
		monsterIDmap.put("193", "Cow Girl");
		monsterIDmap.put("19311", "Sera");
		monsterIDmap.put("19312", "Anne");
		monsterIDmap.put("19313", "Hannah");
		monsterIDmap.put("19314", "");
		monsterIDmap.put("19315", "Cassie");
		monsterIDmap.put("194", "Pirate Captain");
		monsterIDmap.put("19411", "Galleon");
		monsterIDmap.put("19412", "Carrack");
		monsterIDmap.put("19413", "Barque");
		monsterIDmap.put("19414", "Brig");
		monsterIDmap.put("19415", "Frigate");
		monsterIDmap.put("195", "Charger Shark");
		monsterIDmap.put("19511", "Aqcus");
		monsterIDmap.put("19512", "Ignicus");
		monsterIDmap.put("19513", "Zephicus");
		monsterIDmap.put("19514", "Rumicus");
		monsterIDmap.put("19515", "Calicus");
		monsterIDmap.put("196", "Mermaid");
		monsterIDmap.put("19611", "Tetra");
		monsterIDmap.put("19612", "Platy");
		monsterIDmap.put("19613", "Cichlid");
		monsterIDmap.put("19614", "Molly");
		monsterIDmap.put("19615", "Betta");
		monsterIDmap.put("197", "Sea Emperor");
		monsterIDmap.put("19711", "Poseidon");
		monsterIDmap.put("19712", "Okeanos");
		monsterIDmap.put("19713", "Triton");
		monsterIDmap.put("19714", "Pontos");
		monsterIDmap.put("19715", "Manannan");
		monsterIDmap.put("198", "Magic Knight");
		monsterIDmap.put("19811", "Lapis");
		monsterIDmap.put("19812", "Astar");
		monsterIDmap.put("19813", "Lupinus");
		monsterIDmap.put("19814", "Iris");
		monsterIDmap.put("19815", "Lanett");
		monsterIDmap.put("199", "Assassin");
		monsterIDmap.put("19911", "Stella");
		monsterIDmap.put("19912", "Lexy");
		monsterIDmap.put("19913", "Tanya");
		monsterIDmap.put("19914", "Natalie");
		monsterIDmap.put("19915", "Isabelle");
		monsterIDmap.put("200", "Neostone Fighter");
		monsterIDmap.put("20011", "Ryan");
		monsterIDmap.put("20012", "Trevor");
		monsterIDmap.put("20013", "Logan");
		monsterIDmap.put("20014", "Lucas");
		monsterIDmap.put("20015", "Karl");
		monsterIDmap.put("201", "Neostone Agent");
		monsterIDmap.put("20111", "Emma");
		monsterIDmap.put("20112", "Lisa");
		monsterIDmap.put("20113", "Olivia");
		monsterIDmap.put("20114", "Illianna");
		monsterIDmap.put("20115", "Sylvia");
		monsterIDmap.put("202", "Martial Artist");
		monsterIDmap.put("20211", "Luan");
		monsterIDmap.put("20212", "Sin");
		monsterIDmap.put("20213", "Lo");
		monsterIDmap.put("20214", "Hiro");
		monsterIDmap.put("20215", "Jackie");
		monsterIDmap.put("203", "Mummy");
		monsterIDmap.put("20311", "Nubia");
		monsterIDmap.put("20312", "Sonora");
		monsterIDmap.put("20313", "Namib");
		monsterIDmap.put("20314", "Sahara");
		monsterIDmap.put("20315", "Karakum");
		monsterIDmap.put("204", "Anubis");
		monsterIDmap.put("20411", "Avaris");
		monsterIDmap.put("20412", "Khmun");
		monsterIDmap.put("20413", "Iunu");
		monsterIDmap.put("20414", "Amarna");
		monsterIDmap.put("20415", "Thebae");
		monsterIDmap.put("205", "Desert Queen");
		monsterIDmap.put("20511", "Bastet");
		monsterIDmap.put("20512", "Sekhmet");
		monsterIDmap.put("20513", "Hathor");
		monsterIDmap.put("20514", "Isis");
		monsterIDmap.put("20515", "Nephthys");
		monsterIDmap.put("206", "Horus");
		monsterIDmap.put("20611", "Qebehsenuef");
		monsterIDmap.put("20612", "Duamutef");
		monsterIDmap.put("20613", "Imesety");
		monsterIDmap.put("20614", "Wedjat");
		monsterIDmap.put("20615", "Amduat");
		monsterIDmap.put("207", "Jack-o'-lantern");
		monsterIDmap.put("20711", "Chilling");
		monsterIDmap.put("20712", "Smokey");
		monsterIDmap.put("20713", "Windy");
		monsterIDmap.put("20714", "Misty");
		monsterIDmap.put("20715", "Dusky");
		monsterIDmap.put("208", "Frankenstein");
		monsterIDmap.put("20811", "Tractor");
		monsterIDmap.put("20812", "Bulldozer");
		monsterIDmap.put("20813", "Crane");
		monsterIDmap.put("20814", "Driller");
		monsterIDmap.put("20815", "Crawler");
		monsterIDmap.put("209", "Elven Ranger");
		monsterIDmap.put("20911", "Eluin");
		monsterIDmap.put("20912", "Adrian");
		monsterIDmap.put("20913", "Erwin");
		monsterIDmap.put("20914", "Lucien");
		monsterIDmap.put("20915", "Isillen");
		monsterIDmap.put("210", "Harg");
		monsterIDmap.put("21011", "Remy");
		monsterIDmap.put("21012", "Racuni");
		monsterIDmap.put("21013", "Raviti");
		monsterIDmap.put("21014", "Dova");
		monsterIDmap.put("21015", "Kroa");
		monsterIDmap.put("211", "Fairy King");
		monsterIDmap.put("21111", "Psamathe");
		monsterIDmap.put("21112", "Daphnis");
		monsterIDmap.put("21113", "Ganymede");
		monsterIDmap.put("21114", "Oberon");
		monsterIDmap.put("21115", "Nyx");
		monsterIDmap.put("212", "Panda Warrior");
		monsterIDmap.put("21211", "Mo Long");
		monsterIDmap.put("21212", "Xiong Fei");
		monsterIDmap.put("21213", "Feng Yan");
		monsterIDmap.put("21214", "Tian Lang");
		monsterIDmap.put("21215", "Mi Ying");
		monsterIDmap.put("213", "Dice Magician");
		monsterIDmap.put("21311", "Reno");
		monsterIDmap.put("21312", "Ludo");
		monsterIDmap.put("21313", "Morris");
		monsterIDmap.put("21314", "Tablo");
		monsterIDmap.put("21315", "Monte");
		monsterIDmap.put("214", "Harp Magician");
		monsterIDmap.put("21411", "Sonnet");
		monsterIDmap.put("21412", "Harmonia");
		monsterIDmap.put("21413", "Triana");
		monsterIDmap.put("21414", "Celia");
		monsterIDmap.put("21415", "Vivachel");
		monsterIDmap.put("215", "Unicorn");
		monsterIDmap.put("21511", "Amelia");
		monsterIDmap.put("21512", "Helena");
		monsterIDmap.put("21513", "Diana");
		monsterIDmap.put("21514", "Eleanor");
		monsterIDmap.put("21515", "Alexandra");
		monsterIDmap.put("21611", "Amelia");
		monsterIDmap.put("21612", "Helena");
		monsterIDmap.put("21613", "Diana");
		monsterIDmap.put("21614", "Eleanor");
		monsterIDmap.put("21615", "Alexandra");
		monsterIDmap.put("218", "Paladin");
		monsterIDmap.put("21811", "Josephine");
		monsterIDmap.put("21812", "Ophilia");
		monsterIDmap.put("21813", "Louise");
		monsterIDmap.put("21814", "Jeanne");
		monsterIDmap.put("21815", "Leona");
		monsterIDmap.put("15105", "Devilmon");
		monsterIDmap.put("14314", "Rainbowmon");
		monsterIDmap.put("1000111", "Homunculus - Attack (Water)");
		monsterIDmap.put("1000112", "Homunculus - Attack (Fire)");
		monsterIDmap.put("1000113", "Homunculus - Attack (Wind)");
		monsterIDmap.put("1000214", "Homunculus - Support (Light)");
		monsterIDmap.put("1000215", "Homunculus - Support (Dark)");
		
		
		//RUNE EFFECT MAPPING
		runeStatMap.put(1, "FlatHP");
		runeStatMap.put(2, "HP %");
		runeStatMap.put(3, "FlatAtk");
		runeStatMap.put(4, "Atk %");
		runeStatMap.put(5, "FlatDef");
		runeStatMap.put(6, "Def %");
		runeStatMap.put(7, "WEHAVENOIDEA");
		runeStatMap.put(8, "Spd");
		runeStatMap.put(9, "CritRate");
		runeStatMap.put(10, "CritDamage");
		runeStatMap.put(11, "Red");
		runeStatMap.put(12, "Acc");
		
		//RUNE SET MAPPING
		runeSetMap.put(1, "Energy");
		runeSetMap.put(2, "Guard");
		runeSetMap.put(3, "Swift");
		runeSetMap.put(4, "Blade");
		runeSetMap.put(5, "Rage");
		runeSetMap.put(6, "Focus");
		runeSetMap.put(7, "Endure");
		runeSetMap.put(8, "Fatal");
		runeSetMap.put(10, "Despair");
		runeSetMap.put(11, "Vampire");
		runeSetMap.put(13, "Violent");
		runeSetMap.put(14, "Nemesis");
		runeSetMap.put(15, "Will");
		runeSetMap.put(16, "Shield");
		runeSetMap.put(17, "Revenge");
		runeSetMap.put(18, "Destroy");
		runeSetMap.put(19, "Fight");
		runeSetMap.put(20, "Determination");
		runeSetMap.put(21, "Enhance");
		runeSetMap.put(22, "Accuracy");
		runeSetMap.put(23, "Tolerance");		
		
		//RUNE QUALITY MAPPING
		runeQualityMap.put(1, "Normal");
		runeQualityMap.put(2, "Magic");
		runeQualityMap.put(3, "Rare");
		runeQualityMap.put(4, "Hero");
		runeQualityMap.put(5, "Legend");
		
		//MONSTER ELEMENT
		monsterElementMap.put(1, "UNIT_WATER");
		monsterElementMap.put(2, "UNIT_FIRE");
		monsterElementMap.put(3, "UNIT_WIND");
		monsterElementMap.put(4, "UNIT_LIGHT");
		monsterElementMap.put(5, "UNIT_DARK");
		
		
	}
}
