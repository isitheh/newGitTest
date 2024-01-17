package org.codefinity.junior.demoaccessmore;

import org.codefinity.junior.demoaccess.DemoAccessModifier;

public class ModifierCaller {

    private void mModifierCaller() {
        DemoAccessModifier mDemoAccessModifier = new DemoAccessModifier();
        System.out.println(mDemoAccessModifier.publicVar);
        //Will not print 2 from the protected variable - different package
        //System.out.println(mDemoAccessModifier.protectedVar);
        //Will not print 3 from the private variable
        //System.out.println(mDemoAccessModifier.privateVar);
    }

}
