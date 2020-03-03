import subprocess
i = 0
n = 270
a = ['lin1.txt','lin2.txt','lin3.txt','lin4.txt','lin5.txt','lin6.txt','lin7.txt','lin8.txt','lin9.txt','lin10.txt',]
b = ['ut1.txt','ut2.txt','ut3.txt','ut4.txt','ut5.txt','ut6.txt','ut7.txt','ut8.txt','ut9.txt','ut10.txt',]

for i in range(10):
	p1 = subprocess.run(['shuf', '-n',str(n),'Load_Shedding_All_Areas_Schedule_and_Map.clean.final.txt',], capture_output = True,text = True)
	file1 = open(a[i],"a") 
	file1.writelines(p1.stdout)
	file1.close()
	subprocess.run(['java', 'part5',a[i],b[i] ],capture_output = True)
	n = n + 270
 
