import os

path = "DP14"
files = os.listdir(path)


new_files = []
for title in files:
    new_files.append('data.add("' + (title) + '");')

for new_title in new_files:
    print(new_title)



with open("music_name_for_list.txt","w",encoding="utf-8") as f:   
    for d in new_files:
        f.write("%s\n" % d)

# f = open("music_name_for_list.csv","w",encoding="utf-8")

# f.write(str(files))

# f.close()




# print(type(files))