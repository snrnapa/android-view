import os

path = "DP14"
files = os.listdir(path)


# これより下は譜面のタイトルを成形するコードです。


new_files = []
for title in files:
    new_files.append('"' + (title.replace(".html","")) + '",')

for new_title in new_files:
    print(new_title)




with open("MusicName.txt","w",encoding="utf-8") as f:   
    for d in new_files:
        f.write("%s\n" % d)

# これより上は譜面のタイトルを成形するコードです。




# これより下は譜面のタイトルを成形するコードです。


new_files = []
for title in files:
    new_files.append('R.drawable.' + (title) + ',')

for new_title in new_files:
    print(new_title)




with open("FileName.txt","w",encoding="utf-8") as f:   
    for d in new_files:
        f.write("%s\n" % d)

# これより上は譜面のタイトルを成形するコードです。





# f = open("music_name_for_list.csv","w",encoding="utf-8")

# f.write(str(files))

# f.close()




# print(type(files))