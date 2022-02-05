import os

path = "DP14"
files = os.listdir(path)


new_files = []
for title in files:
    new_files.append('"' + (title) + '",')

for new_title in new_files:
    print(new_title)
    

with open("music_name_for_list.txt","w",encoding="utf-8") as f:
    f.writelines(new_files)

# f = open("music_name_for_list.csv","w",encoding="utf-8")

# f.write(str(files))

# f.close()




# print(type(files))
