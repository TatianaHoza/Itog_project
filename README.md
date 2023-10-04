# Итоговая контрольная работа #

## Информация о проекте ##
Необходимо организовать систему учета для питомника в котором живут
домашние и вьючные животные.

## Задание ##
1. Используя команду cat в терминале операционной системы Linux, создать
   два файла Домашние животные (заполнив файл собаками, кошками,
   хомяками) и Вьючные животными заполнив файл Лошадьми, верблюдами и
   ослы), а затем объединить их. Просмотреть содержимое созданного файла.
   Переименовать файл, дав ему новое имя (Друзья человека).

![1](/home/t/Документы/Itog_project/screens/1.png)

2. Создать директорию, переместить файл туда.

![2](/home/t/Документы/Itog_project/screens/2.png)

3. Подключить дополнительный репозиторий MySQL. Установить любой пакет
   из этого репозитория.

![3](/home/t/Документы/Itog_project/screens/3.png)

4. Установить и удалить deb-пакет с помощью dpkg.

![4](/home/t/Документы/Itog_project/screens/4.png)

5. Выложить историю команд в терминале ubuntu

 14  cd Itog_project \
   15  cat > home_animals \
   16  cat > pack_animals \
   17  ls -l \
   18  cat home_animals pack_animals > mans_friends \
   19  ls -l \
   20  less mans_friends \
   21  mv mans_friends friends_mans \
   22  ls -l \
   23  mkdir animals \
   24  ls \
   25  mv friends_mans animals/ \
   26  ls -l \
   27  cd animals/ \
   28  ls \
   29  sudo apt-get update \
   30  sudo apt-get install mysql-server \
   31  sudo mysql_secure_installation \
   32  sudo service mysql status \
   33  sudo apt install path_to_deb_file \
   34  sudo wget https://download.docker.com/linux/ubuntu/dists/jammy/pool/stable/amd64/docker-ce-cli_20.10.13~3-0~ubuntu-jammy_amd64.deb \
   35  sudo dpkg -i docker-ce-cli_20.10.133-0ubuntu-jammy_amd64.deb \
   36  sudo dpkg docker-ce-cli_20.10.13~3-0~ubuntu-jammy_amd64.deb \
   37  sudo dpkg -i  docker-ce-cli_20.10.13~3-0~ubuntu-jammy_amd64.deb \
   38  sudo dpkg -r docker-ce-cli \
   39  ls -l \
   40  history \ 

6. Нарисовать диаграмму, в которой есть класс родительский класс, домашние
   животные и вьючные животные, в составы которых в случае домашних
   животных войдут классы: собаки, кошки, хомяки, а в класс вьючные животные
   войдут: Лошади, верблюды и ослы.

![6](https://github.com/TatianaHoza/Itog_project/assets/91697673/0ab27857-a8e5-41f9-9449-80eee1c09b8b)

7. В подключенном MySQL репозитории создать базу данных “Друзья
   человека”

   ![7](/home/t/Документы/Itog_project/screens/7)

8. Создать таблицы с иерархией из диаграммы в БД

![8.1](/home/t/Документы/Itog_project/screens/8.1.png)
![8.2](/home/t/Документы/Itog_project/screens/8.2.png)
9. Заполнить низкоуровневые таблицы именами(животных), командами
   которые они выполняют и датами рождения

![9.1](/home/t/Документы/Itog_project/screens/9.1.png)
![9.2](/home/t/Документы/Itog_project/screens/9.2.png)
![9.3](/home/t/Документы/Itog_project/screens/9.3.png)


10. Удалив из таблицы верблюдов, т.к. верблюдов решили перевезти в другой
    питомник на зимовку. Объединить таблицы лошади, и ослы в одну таблицу.
    ![10](/home/t/Документы/Itog_project/screens/10.png)
11. Создать новую таблицу “молодые животные” в которую попадут все
    животные старше 1 года, но младше 3 лет и в отдельном столбце с точностью
    до месяца подсчитать возраст животных в новой таблице

![11](/home/t/Документы/Itog_project/screens/11.png)
12. Объединить все таблицы в одну, при этом сохраняя поля, указывающие на
    прошлую принадлежность к старым таблицам.
