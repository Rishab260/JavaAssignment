import os
dirs = [name for name in os.listdir('.')if os.path.isdir(os.path.join('.', name))]
print("Sub-Directories Found:",end=':')
print(dirs)

for dir in dirs:
 
    os.system(f"javac {dir}//*.java") 
    print(f"{dir} Compiled Successfully")

    
