DESCRIPTION ="Simple helloworld application"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://userprog.c\
           file://Makefile"

S = "${WORKDIR}"

do_compile() {
       bbnote "Compilation started"
       make
       bbnote "compilation complete"

}

do_install() {
       bbwarn "installation started"
       install -d ${D}${bindir}
       install -m 0775 userprog ${D}${bindir}
       bbwarn "installation completed"

}
