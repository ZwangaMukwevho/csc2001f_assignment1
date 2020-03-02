import subprocess
i = 0
#os.system("part5.java" + " Load_Shedding_All_Areas_Schedule_and_Map.clean.final" + "pol")
##for i in range(10):
	##print(i)
subprocess.run(['java', 'part5','Load_Shedding_All_Areas_Schedule_and_Map.clean.final.txt','pol.txt' ])
#subprocess.run('ls')
