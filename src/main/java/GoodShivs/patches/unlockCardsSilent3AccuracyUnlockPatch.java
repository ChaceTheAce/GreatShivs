//package GoodShivs.patches;
//
//import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
//import com.megacrit.cardcrawl.unlock.cards.Silent3.AccuracyUnlock;
//import com.megacrit.cardcrawl.unlock.UnlockTracker;
//import javassist.CannotCompileException;
//import javassist.expr.ExprEditor;
//import javassist.expr.MethodCall;
//
//import java.util.ArrayList;
//
//public class unlockCardsSilent3AccuracyUnlockPatch {
//    @SpirePatch(
//            clz = UnlockTracker.class,
//            method = "getUnlockBundle"
//    )
//    public static class noUnlock {
//        public static ExprEditor Instrument() {
//            return new ExprEditor() {
//
//                @Override
//                public void edit (MethodCall m) throws CannotCompileException {
//                    if(m.getClassName().equals(ArrayList.class.getName()) && m.getMethodName().equals("add")) {
///
//                        m.replace("if(!$1.class.getName().equals("+ AccuracyUnlock.class.getName() + ")) {" +
//                                "$_ = $proceed($1);" +
//                                "}");
//
//                    }
//                }
//            };
//        }
//    }
//}
