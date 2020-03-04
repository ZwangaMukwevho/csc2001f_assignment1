import subprocess
i = 0;
name = ['LSArrayApp']
searchkeys = ['"1" "10" "00"' , '"5" "28" "16"','"7" "13" "20"',]
name1 = ['>>']

filename = ['part1_correct_output.txt','part1_wrong_output.txt','part1_correct_output.txt']
for i in range(1):
	p1 =  subprocess.run(['java', name[0], "8", "16", "22", name1[0], 'output.txt'])
	 
