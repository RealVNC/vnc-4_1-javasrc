/* Copyright (C) 2002-2005 RealVNC Ltd.  All Rights Reserved.
 * 
 * This is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this software; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307,
 * USA.
 */

package rfb;

public class CMsgWriterV3 extends CMsgWriter {

  public CMsgWriterV3(ConnParams cp_, rdr.OutStream os_) { super(cp_, os_); }

  public void writeClientInit(boolean shared) {
    os.writeU8(shared?1:0);
    endMsg();
  }

  public void startMsg(int type) {
    os.writeU8(type);
  }

  public void endMsg() {
    os.flush();
  }
}
