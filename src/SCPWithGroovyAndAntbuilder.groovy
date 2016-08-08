/**
 * Created by geng on 2016/8/8.
 */
def ant = new AntBuilder()
ant.scp(file: 'user@host:/tmp/file.txt',
        todir: "/home/localuser/",
        verbose: true,
        keyfile: "/home/localuser/.ssh/id_dsa",
        passphrase: "password")