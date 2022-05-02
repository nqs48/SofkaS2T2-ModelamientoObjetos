<!-- ABOUT THE PROJECT -->
# Exercise No. 2 CONCURRENT MAIN CLASSES 

Is it possible to run a java program that contains multiple classes with main methods?
If yes, how is the entry point to a program determined?


- Yes, is possible to have the concurrent main classes. 

---

## RUN/DEBUG CONFIGURATION:  

-  When you have more than one class with a main method, you can edit configurations in the window Run/Debug 
Configuration on your environment indicating which of these two classes is going to be the entry point.


### Clic on 'Edit Configurations'

Select the add configuration window.

![image](https://res.cloudinary.com/adev48/image/upload/v1651364109/Sofka%20Assets/Semana%202/Taller%202/AddConfig01_iw6x5e.png)

### Run/debug Configurations :  

Add a new application type configuration in the run and debug configurations window. 

![image](https://res.cloudinary.com/adev48/image/upload/v1651364109/Sofka%20Assets/Semana%202/Taller%202/AddConfig02_ucfy6x.png)

### Add name

Add a name that identifies the entry point.

![image](https://res.cloudinary.com/adev48/image/upload/v1651364109/Sofka%20Assets/Semana%202/Taller%202/AddConfig03_p0fpzb.png)

### Choose a main class 

Select the main class you want as the entry point to the application, and confirm the changes.

![image](https://res.cloudinary.com/adev48/image/upload/v1651364110/Sofka%20Assets/Semana%202/Taller%202/AddConfig04_mel1zm.png)

### Verify and check

Check the actions and clic on OK button.

![image](https://res.cloudinary.com/adev48/image/upload/v1651364110/Sofka%20Assets/Semana%202/Taller%202/AddConfig05_vsysa6.png)

### View the new Config

Now you will be able to see the new configuration of the main class.

![image](https://res.cloudinary.com/adev48/image/upload/v1651364109/Sofka%20Assets/Semana%202/Taller%202/AddConfig06_zkocrv.png)

---

## CREATE ARTIFACT .JAR: 

You can do this by creating a new artifact, selecting the desired main class as the project entry 
point. After this, a MANIFEST folder will be created, the project artifacts are built, generating a new folder inside the OUT
folder with the built artifacts and a .JAR file, which can be executed from the terminal.
          
### Select Project structure

Open the project structure configuration.

![image](https://res.cloudinary.com/adev48/image/upload/v1651369142/Sofka%20Assets/Semana%202/Taller%202/ConfigJar01_xt6ppx.png)

### Add a new JAR artifact

Add artifact JAR from modules with dependencies.

![image](https://res.cloudinary.com/adev48/image/upload/v1651369142/Sofka%20Assets/Semana%202/Taller%202/ConfigJar02_nfhizb.png)

### Choose a main class 

Select the main class you want as the entry point to the application, and confirm the changes.

![image](https://res.cloudinary.com/adev48/image/upload/v1651369142/Sofka%20Assets/Semana%202/Taller%202/ConfigJar03_oylzmf.png)

### Verify and check

Check the actions and clic on OK button.

![image](https://res.cloudinary.com/adev48/image/upload/v1651369142/Sofka%20Assets/Semana%202/Taller%202/ConfigJar04_yygeir.png)

### Check general changes 

Check all actions on the project structure window and click on OK button.

![image](https://res.cloudinary.com/adev48/image/upload/v1651369142/Sofka%20Assets/Semana%202/Taller%202/ConfigJar05_k3nzf2.png)

### View root project

In the project folder a new directory called META-INF is generated that contains the MANIFEST.MF file.

![image](https://res.cloudinary.com/adev48/image/upload/v1651369149/Sofka%20Assets/Semana%202/Taller%202/ConfigJar06_v670fp.png)

### Build Artifacts

Now is time to build project artifacts.

![image](https://res.cloudinary.com/adev48/image/upload/v1651369149/Sofka%20Assets/Semana%202/Taller%202/ConfigJar07_uj9kdi.png)

### Choose the artifact

Select the desired artifact and click build. 

![image](https://res.cloudinary.com/adev48/image/upload/v1651369149/Sofka%20Assets/Semana%202/Taller%202/ConfigJar08_sbwof4.png)

### View Root directory 

An ARTIFACTS folder is generated in the output of the project, inside it will have a file with the name of the project and 
with the extension .JAR .

![image](https://res.cloudinary.com/adev48/image/upload/v1651369149/Sofka%20Assets/Semana%202/Taller%202/ConfigJar09_ggjj5x.png)

### Run the file .JAR .

Now you can open the project from the command terminal with the following command.

```
$ java -jar 'hereNameFile' 
```

![image](https://res.cloudinary.com/adev48/image/upload/v1651369149/Sofka%20Assets/Semana%202/Taller%202/ConfigJar10_kisc2o.png)

---

<!-- CONTACT -->
## Collaborators
```
Nestor Quiroga Suarez
Jr. Software Developer
```
- LinkedIn => [Nestor Quiroga Suárez](https://www.linkedin.com/in/nqs48/)


Tutorial Link: [CONCURRENT MAIN CLASSES -- README.MD](https://github.com/nqs48/SofkaS2T2-ModelamientoObjetos/tree/main/src/Model/Exc2)

<p align="right">(<a href="#top">back to top</a>)</p>
