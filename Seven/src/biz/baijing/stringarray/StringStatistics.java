package biz.baijing.stringarray;

import java.util.Scanner;

public class StringStatistics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一串字符：");

        String str = sc.nextLine();

        // 定义统计变量和初始化
        int capitalStr = 0;
        int lowerCaseStr = 0;
        int numbersStr = 0;

        // 取 str 的字符，并统计 Statistics
        for (int i = 0; i < str.length(); i++) {
            // 这里 ch 是 char 类型；在 if 语句中 ch 会被转化成 int 类型去比对 ASCII 表中的序号
            // 'A' 是 ASCII 表中 65 ， ‘B’ 66 以此类推，所以才能写 if 判断条件
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                capitalStr++;
            }else if (ch >= 'a' && ch <= 'z') {
                lowerCaseStr++;
            }else if (ch >= '0' && ch <= '9') {
                //  (ch >= '0' && ch <= '9')  写成  (ch >= 0 && ch <= 9) 是错的
                // ch 是转化为 int 后，检索 ASCII 表，在 ASCII表中 0 9 代表的是特殊字符
                numbersStr++;
            }
        }

        System.out.println("capitalStr " + capitalStr);
        System.out.println("lowerCaseStr " + lowerCaseStr);
        System.out.println("numbersStr "  + numbersStr);
    }
}

/*
请输入一串字符：
asdfjilJSDcoiufnklernvIS:DFUCO*ISE7847589348kJV786384hri
capitalStr 15
lowerCaseStr 23
numbersStr 16

 */

/*

ASCII值	控制字符	ASCII值	控制字符	ASCII值	控制字符	ASCII值	控制字符
0	NUT	32	(space)	64	@	96	、
1	SOH	33	!	65	A	97	a
2	STX	34	"	66	B	98	b
3	ETX	35	#	67	C	99	c
4	EOT	36	$	68	D	100	d
5	ENQ	37	%	69	E	101	e
6	ACK	38	&	70	F	102	f
7	BEL	39	,	71	G	103	g
8	BS	40	(	72	H	104	h
9	HT	41	)	73	I	105	i
10	LF	42	*	74	J	106	j
11	VT	43	+	75	K	107	k
12	FF	44	,	76	L	108	l
13	CR	45	-	77	M	109	m
14	SO	46	.	78	N	110	n
15	SI	47	/	79	O	111	o
16	DLE	48	0	80	P	112	p
17	DCI	49	1	81	Q	113	q
18	DC2	50	2	82	R	114	r
19	DC3	51	3	83	S	115	s
20	DC4	52	4	84	T	116	t
21	NAK	53	5	85	U	117	u
22	SYN	54	6	86	V	118	v
23	TB	55	7	87	W	119	w
24	CAN	56	8	88	X	120	x
25	EM	57	9	89	Y	121	y
26	SUB	58	:	90	Z	122	z
27	ESC	59	;	91	[	123	{
28	FS	60	<	92	\	124	|
29	GS	61	=	93	]	125	}
30	RS	62	>	94	^	126	`
31	US	63	?	95	_	127	DEL
 */