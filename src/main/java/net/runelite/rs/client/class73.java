package net.runelite.rs.client;

import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("bx")
public class class73 {
   @ObfuscatedName("m")
   int field1343;
   @ObfuscatedName("j")
   int field1344;
   @ObfuscatedName("f")
   int[] field1345;
   @ObfuscatedName("l")
   int[] field1346;
   @ObfuscatedName("u")
   float[][] field1347;
   @ObfuscatedName("a")
   int[] field1348;

   @ObfuscatedName("l")
   float[] method1602() {
      return this.field1347[this.method1604()];
   }

   class73() {
      class70.method1556(24);
      this.field1344 = class70.method1556(16);
      this.field1343 = class70.method1556(24);
      this.field1345 = new int[this.field1343];
      boolean var1 = class70.method1554() != 0;
      int var2;
      int var3;
      int var5;
      if(var1) {
         var2 = 0;

         for(var3 = class70.method1556(5) + 1; var2 < this.field1343; ++var3) {
            int var4 = class70.method1556(class21.method608(this.field1343 - var2));

            for(var5 = 0; var5 < var4; ++var5) {
               this.field1345[var2++] = var3;
            }
         }
      } else {
         boolean var14 = class70.method1554() != 0;

         for(var3 = 0; var3 < this.field1343; ++var3) {
            if(var14 && class70.method1554() == 0) {
               this.field1345[var3] = 0;
            } else {
               this.field1345[var3] = class70.method1556(5) + 1;
            }
         }
      }

      this.method1603();
      var2 = class70.method1556(4);
      if(var2 > 0) {
         float var15 = class70.method1561(class70.method1556(32));
         float var16 = class70.method1561(class70.method1556(32));
         var5 = class70.method1556(4) + 1;
         boolean var6 = class70.method1554() != 0;
         int var7;
         if(var2 == 1) {
            var7 = method1608(this.field1343, this.field1344);
         } else {
            var7 = this.field1343 * this.field1344;
         }

         this.field1346 = new int[var7];

         int var8;
         for(var8 = 0; var8 < var7; ++var8) {
            this.field1346[var8] = class70.method1556(var5);
         }

         this.field1347 = new float[this.field1343][this.field1344];
         float var9;
         int var10;
         int var11;
         if(var2 == 1) {
            for(var8 = 0; var8 < this.field1343; ++var8) {
               var9 = 0.0F;
               var10 = 1;

               for(var11 = 0; var11 < this.field1344; ++var11) {
                  int var12 = var8 / var10 % var7;
                  float var13 = (float)this.field1346[var12] * var16 + var15 + var9;
                  this.field1347[var8][var11] = var13;
                  if(var6) {
                     var9 = var13;
                  }

                  var10 *= var7;
               }
            }
         } else {
            for(var8 = 0; var8 < this.field1343; ++var8) {
               var9 = 0.0F;
               var10 = var8 * this.field1344;

               for(var11 = 0; var11 < this.field1344; ++var11) {
                  float var17 = (float)this.field1346[var10] * var16 + var15 + var9;
                  this.field1347[var8][var11] = var17;
                  if(var6) {
                     var9 = var17;
                  }

                  ++var10;
               }
            }
         }
      }

   }

   @ObfuscatedName("m")
   void method1603() {
      int[] var1 = new int[this.field1343];
      int[] var2 = new int[33];

      int var3;
      int var4;
      int var5;
      int var6;
      int var7;
      int var8;
      int var10;
      for(var3 = 0; var3 < this.field1343; ++var3) {
         var4 = this.field1345[var3];
         if(var4 != 0) {
            var5 = 1 << 32 - var4;
            var6 = var2[var4];
            var1[var3] = var6;
            int var9;
            if((var6 & var5) != 0) {
               var7 = var2[var4 - 1];
            } else {
               var7 = var6 | var5;

               for(var8 = var4 - 1; var8 >= 1; --var8) {
                  var9 = var2[var8];
                  if(var9 != var6) {
                     break;
                  }

                  var10 = 1 << 32 - var8;
                  if((var9 & var10) != 0) {
                     var2[var8] = var2[var8 - 1];
                     break;
                  }

                  var2[var8] = var9 | var10;
               }
            }

            var2[var4] = var7;

            for(var8 = var4 + 1; var8 <= 32; ++var8) {
               var9 = var2[var8];
               if(var9 == var6) {
                  var2[var8] = var7;
               }
            }
         }
      }

      this.field1348 = new int[8];
      int var11 = 0;

      for(var3 = 0; var3 < this.field1343; ++var3) {
         var4 = this.field1345[var3];
         if(var4 != 0) {
            var5 = var1[var3];
            var6 = 0;

            for(var7 = 0; var7 < var4; ++var7) {
               var8 = Integer.MIN_VALUE >>> var7;
               if((var5 & var8) != 0) {
                  if(this.field1348[var6] == 0) {
                     this.field1348[var6] = var11;
                  }

                  var6 = this.field1348[var6];
               } else {
                  ++var6;
               }

               if(var6 >= this.field1348.length) {
                  int[] var12 = new int[this.field1348.length * 2];

                  for(var10 = 0; var10 < this.field1348.length; ++var10) {
                     var12[var10] = this.field1348[var10];
                  }

                  this.field1348 = var12;
               }

               var8 >>>= 1;
            }

            this.field1348[var6] = ~var3;
            if(var6 >= var11) {
               var11 = var6 + 1;
            }
         }
      }

   }

   @ObfuscatedName("f")
   int method1604() {
      int var1;
      for(var1 = 0; this.field1348[var1] >= 0; var1 = class70.method1554() != 0?this.field1348[var1]:var1 + 1) {
         ;
      }

      return ~this.field1348[var1];
   }

   @ObfuscatedName("j")
   static int method1608(int var0, int var1) {
      int var2;
      for(var2 = (int)Math.pow((double)var0, 1.0D / (double)var1) + 1; class120.method2779(var2, var1) > var0; --var2) {
         ;
      }

      return var2;
   }
}
