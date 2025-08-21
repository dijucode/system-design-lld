        +-----------------+
        |  DriveStrategy  |  <--- Interface
        +-----------------+
                ^
                |
   ------------------------------
   |              |             |
+-----------+  +-----------+  +-----------+
|NormalDrive|  |SportsDrive|  |OffRoadDrive|
+-----------+  +-----------+  +-----------+

        +-----------------+
        |    Vehicle      |
        +-----------------+
        | - driveStrategy |
        +-----------------+
        | + drive()       |
        +-----------------+
                ^
                |
      Strategy injected via constructor
