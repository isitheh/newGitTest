package org.codefinity.junior.demoaccess;

import org.codefinity.junior.demoaccess.DemoAccessModifier;

public class Extender extends DemoAccessModifier {
    private void mExtender() {
        DemoAccessModifier mDemoAccessModifier = new DemoAccessModifier();
        //Will print 1 from public variable
        System.out.println(mDemoAccessModifier.publicVar);
        //Will print 2 from the protected variable
        System.out.println(mDemoAccessModifier.protectedVar);
        //Will not print 3 from the private variable
        //System.out.println(mDemoAccessModifier.privateVar);
    }
}
