package defpackage;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

public class lu {
    static File ac;
    static boolean aj = false;
    static Hashtable an = new Hashtable(16);

    lu() throws Throwable {
        try {
            throw new Error();
        } catch (Throwable e) {
            throw ei.ac(e, "lu.<init>(" + ')');
        }
    }

    static void an(File file) {
        ac = file;
        if (ac.exists()) {
            aj = true;
            return;
        }
        throw new RuntimeException("");
    }

    static void ao(File file) {
        ac = file;
        if (ac.exists()) {
            aj = true;
            return;
        }
        throw new RuntimeException("");
    }

    static void aq(File file) {
        ac = file;
        if (ac.exists()) {
            aj = true;
            return;
        }
        throw new RuntimeException("");
    }

    static File aa(String str) {
        RandomAccessFile randomAccessFile;
        if (aj) {
            File file = (File) an.get(str);
            if (file == null) {
                file = new File(ac, str);
                try {
                    if (new File(file.getParent()).exists()) {
                        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rw");
                        try {
                            int read = randomAccessFile2.read();
                            randomAccessFile2.seek(0);
                            randomAccessFile2.write(read);
                            randomAccessFile2.seek(0);
                            randomAccessFile2.close();
                            an.put(str, file);
                        } catch (Exception e) {
                            randomAccessFile = randomAccessFile2;
                            if (randomAccessFile != null) {
                                try {
                                    randomAccessFile.close();
                                } catch (Exception e2) {
                                }
                            }
                            throw new RuntimeException();
                        }
                    }
                    throw new RuntimeException("");
                } catch (Exception e3) {
                    randomAccessFile = null;
                    if (randomAccessFile != null) {
                        randomAccessFile.close();
                    }
                    throw new RuntimeException();
                }
            }
            return file;
        }
        throw new RuntimeException("");
    }

    static File ak(String str) {
        RandomAccessFile randomAccessFile;
        if (aj) {
            File file = (File) an.get(str);
            if (file == null) {
                file = new File(ac, str);
                try {
                    if (new File(file.getParent()).exists()) {
                        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rw");
                        try {
                            int read = randomAccessFile2.read();
                            randomAccessFile2.seek(0);
                            randomAccessFile2.write(read);
                            randomAccessFile2.seek(0);
                            randomAccessFile2.close();
                            an.put(str, file);
                        } catch (Exception e) {
                            randomAccessFile = randomAccessFile2;
                            if (randomAccessFile != null) {
                                try {
                                    randomAccessFile.close();
                                } catch (Exception e2) {
                                }
                            }
                            throw new RuntimeException();
                        }
                    }
                    throw new RuntimeException("");
                } catch (Exception e3) {
                    randomAccessFile = null;
                    if (randomAccessFile != null) {
                        randomAccessFile.close();
                    }
                    throw new RuntimeException();
                }
            }
            return file;
        }
        throw new RuntimeException("");
    }

    static File ap(String str) {
        RandomAccessFile randomAccessFile;
        if (aj) {
            File file = (File) an.get(str);
            if (file == null) {
                file = new File(ac, str);
                try {
                    if (new File(file.getParent()).exists()) {
                        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rw");
                        try {
                            int read = randomAccessFile2.read();
                            randomAccessFile2.seek(0);
                            randomAccessFile2.write(read);
                            randomAccessFile2.seek(0);
                            randomAccessFile2.close();
                            an.put(str, file);
                        } catch (Exception e) {
                            randomAccessFile = randomAccessFile2;
                            if (randomAccessFile != null) {
                                try {
                                    randomAccessFile.close();
                                } catch (Exception e2) {
                                }
                            }
                            throw new RuntimeException();
                        }
                    }
                    throw new RuntimeException("");
                } catch (Exception e3) {
                    randomAccessFile = null;
                    if (randomAccessFile != null) {
                        randomAccessFile.close();
                    }
                    throw new RuntimeException();
                }
            }
            return file;
        }
        throw new RuntimeException("");
    }

    static File at(String str) {
        RandomAccessFile randomAccessFile;
        if (aj) {
            File file = (File) an.get(str);
            if (file == null) {
                file = new File(ac, str);
                try {
                    if (new File(file.getParent()).exists()) {
                        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rw");
                        try {
                            int read = randomAccessFile2.read();
                            randomAccessFile2.seek(0);
                            randomAccessFile2.write(read);
                            randomAccessFile2.seek(0);
                            randomAccessFile2.close();
                            an.put(str, file);
                        } catch (Exception e) {
                            randomAccessFile = randomAccessFile2;
                            if (randomAccessFile != null) {
                                try {
                                    randomAccessFile.close();
                                } catch (Exception e2) {
                                }
                            }
                            throw new RuntimeException();
                        }
                    }
                    throw new RuntimeException("");
                } catch (Exception e3) {
                    randomAccessFile = null;
                    if (randomAccessFile != null) {
                        randomAccessFile.close();
                    }
                    throw new RuntimeException();
                }
            }
            return file;
        }
        throw new RuntimeException("");
    }
}
