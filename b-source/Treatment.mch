// Copyright (C) 2018 Clearsy
//
// This file is part of MockPilot.
//
// MockPilot is free software; you can redistribute it and/or modify it
// under the terms of the GNU General Public License as published by
// the Free Software Foundation; either version 3 of the License, or
// (at your option) any later version.
//
// MockPilot is distributed in the hope that it will be useful, but WITHOUT
// ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
// or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public
// License for more details.
//
// You should have received a copy of the GNU General Public License
// along with this program.  If not, see <http://www.gnu.org/licenses/>.

MACHINE
    Treatment

SETS
    FALLBACKS =
    {
        INCONSISTENT_POSITION,
        INCONSISTENT_SPEED,
        
        NOMINAL
    }

OPERATIONS
    
    aopp, fallback <-- aopp_authorization =
    BEGIN
        aopp, fallback :( aopp: BOOL & fallback: FALLBACKS & (aopp = TRUE => fallback = NOMINAL) )
    END    

END
