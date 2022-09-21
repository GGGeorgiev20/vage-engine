import os

srcdir = 'src'
output = 'mainpackage'

def compile(file):
    try:
        os.system(f'javac -d . {file}.java')
        print(f"BUILD: Compiled {os.path.basename(file)}.java")
    except:
        print(f"BUILD: Error when compiling {os.path.basename(file)}.java")
        exit(1)

for path, subdirs, files in os.walk(srcdir):
    for file in files:
        if file.endswith('.java'):
            compile(os.path.join(path, file[:-5]))

print("BUILD: Build successful")

os.system(f'java {srcdir}/Main.java')