/**
 * Created by geng on 2016/8/8.
 */
// This examples show how to use the ant ssh task with the Antbuilder in groovy.
def ant = new AntBuilder()
ant.sshexec(host: "hostname",
        keyfile: "/home/localuser/.ssh/id_dsa",
        username: "remoteuser",
        command: "ls")
