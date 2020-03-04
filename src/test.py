import subprocess
i = 0
n = 270
a = ['inp1.txt','inp2.txt','inp3.txt','inp4.txt','inp5.txt','inp6.txt','inp7.txt','inp8.txt','inp9.txt','inp10.txt',]
b = ['u1.txt','u2.txt','u3.txt','u4.txt','u5.txt','u6.txt','u7.txt','u8.txt','u9.txt','u10.txt',]

for i in range(10):
	p1 = subprocess.run(['shuf', '-n',str(n),'Load_Shedding_All_Areas_Schedule_and_Map.clean.final.txt',], capture_output = True,text = True)
	file1 = open(a[i],"a") 
	file1.writelines(p1.stdout)
	file1.close()
	subprocess.run(['java', 'part5',a[i],b[i] ],capture_output = True)
	n = n + 270
	print(n)
 
