require recipes-core/images/core-image-minimal.bb
IMAGE_INSTALL += "usbutils"

#dropbear ssh server
#IMAGE_FEATURES = "ssh-server-dropbear debug-tweaks read-only-rootfs splash tools-debug tools-sdk"
#above command used for tool debug and sdk . but take time /not use for production code
IMAGE_FEATURES = "ssh-server-dropbear debug-tweaks read-only-rootfs "
IMAGE_NAME= "myimage"
IMAGE_INSTALL_append = " mycmake"
