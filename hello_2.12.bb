DESCRIPTION ="Simple helloworld auto tool package application"
LICENSE = "GPLv3+"
LIC_FILES_CHKSUM = "file://COPYING;md5=1ebbd3e34237af26da5dc08a4e440464"

#PR = "r0"

SRC_URI = "https://ftp.gnu.org/gnu/hello/hello-2.12.tar.gz"
#SRC_URI[md5sum] = "6cd0ffea3884a4e79330338dcc2987d6"
#SRC_URI[sha256sum] = "31e066137a962676e89f69d1b65382de95a7ef7d914b8cb956f41ea72e0f516b"
SRC_URI[md5sum] = "048d95d41f9c0bd3424bf0917f53782d"
SRC_URI[sha256sum] = "cf04af86dc085268c5f4470fbae49b18afbc221b78096aab842d934a76bad0ab"



inherit autotools-brokensep gettext
EXTRA_OECONF += "--disable-nls"
